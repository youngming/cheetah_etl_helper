from etl.helper.utils import sql
from etl.helper.utils.common.file_operation import read_txt
from etl.helper.utils.sql.sql_analyzer import FunctionElement, TablePartition, TableType, analysis, scan_specific, items_select, output_index
from functools import reduce
from enum import Enum
import logging
import re
from etl.helper.utils.common import mysql_ops
from etl.helper.module.Messager import Messager

#Throw this exception when target table wrote in SQL file unmatched file name
# class TargetTableException(Exception):
#     pass

#Throw this exception when target table build columns index/number unmatched between metadata and running script
# class TargetTableConstructIndexException(Exception):
#     pass

class Layer(Enum):
    STG=100
    ODH=200
    ODS=300
    DWD=400
    DWS=500
    DM=600
    ADS=700
    UNKNOW=10000

# All HQL element base class
class ElementBase(object):
    
    def __hash__(self):
        return self.path.__hash__()

    def __eq__(self, other):
        if(isinstance(other, ElementBase)):
            return self.output_name == other.output_name
        else:
            return False

    def __init__(self, path, local_etl_home, server_etl_home):  
        self.__path = path
        self.__local_etl_home = local_etl_home
        self.__server_etl_home = server_etl_home
    
    @property
    def path(self):
        return self.__path

    # @property
    # def local_etl_home(self):
    #     return self.__local_etl_home
    
    # @property
    # def server_etl_home(self):
    #     return self.__server_etl_home

    @property
    def server_path(self):
        return self.__path.replace(self.__local_etl_home, self.__server_etl_home)

# HQL element which can get all info from file name (STG)
class FileElement(ElementBase):
    
    def __get_layer(self):
        return Layer[self.path.split('/')[-3].upper()]

    def __get_name(self):
        return self.path.split('/')[-1].replace('.sql', '')
    
    def __get_output_name(self):
        file_name = self.path.split('/')[-1]
        table_segments = file_name.replace('[', '').replace(']', '').strip().split('.')[0:-1]
        output_table = str(self.layer.name.lower() + '.' + reduce(lambda tp1, tp2: tp1 + '_' + tp2, table_segments))
        return output_table
    
    def __parse_sql_header(self):
        header_list = re.findall(r'--.*?=.*?\n', self.__sql_text)
        header_list = list(map(lambda head_item : re.sub(r'--', '', head_item).strip(), header_list))
        result = {}
        for header_item in header_list : 
            result[header_item.split('=')[0]] = header_item.split('=')[1]
        return result
    
    def __get_output(self):
        return (self.__get_output_name().upper(),)

    def get_sentences(self, remove_set_segment = False):
        #remove sql header
        sql_text_tmp = re.sub(r'--[\w\s].*?\n', ' ', self.__sql_text)
        #replace ';' with ',' in comment segment
        sql_text_tmp = re.sub(r';(?=.*\')', ',', sql_text_tmp)
        if(remove_set_segment) :
            #remove set command in sql script like set hive.xxx.xx.xx=xx;
            sql_text_tmp = re.sub(r'set\s.*=.*;', ' ', sql_text_tmp)
        #remove all enter
        sql_text_tmp = re.sub('\\n+', ' ', sql_text_tmp)
        #remove comment block with /* */ included
        sql_text_tmp = re.sub(r'/[*].*?[*]/', ' ', sql_text_tmp)
        #merge multi space with one space
        sql_text_tmp = re.sub(r'\s+', ' ', sql_text_tmp)
        #split a SQL block to every SQL sentences with ';'
        sql_text_tmp = sql_text_tmp.split(';')
        #remove the empty sentence
        ls_sql_statement_final = list(
            map(lambda sql_item: re.sub(r'^\s+', '', sql_item) ,
            filter(lambda sql: sql and sql.strip(), sql_text_tmp)))
        return ls_sql_statement_final

    def __fill(self):
        self.__sql_text = read_txt(self.path)
        self.__layer = self.__get_layer()
        self.__header = self.__parse_sql_header()
        self.__name = self.__get_name()

    def __init__(self, path, local_etl_home, server_etl_home):
        super().__init__(path, local_etl_home, server_etl_home)
        self.__fill()

    @property
    def name(self):
        return self.__name

    @property
    def show_name(self):
        return self.layer.name + '.' + self.name

    @property
    def output_name(self):
        return self.__get_output_name()

    @property
    def reference_name(self):
        return self.__get_output_name()
        
    @property
    def layer(self):
        return self.__layer

    @property
    def header(self):
        return self.__header

    @property
    def sql(self):
        return self.__sql_text

    @property
    def input(self):
        self.__input = ()
        return self.__input
    
    @property
    def output(self):
        self.__output = self.__get_output()
        return self.__output

    def __str__(self):
        return str.format(
            'header:{} | layer:{} | name:{} | show_name:{} | output_name:{} | reference_name:{} | path:{} | server_path:{} | input:{} | output:{}', 
            self.header, 
            self.layer, 
            self.name,
            self.show_name,
            self.output_name, 
            self.reference_name, 
            self.path, 
            self.server_path, 
            self.input, 
            self.output)
    
    __repr__ = __str__
        



# HQL element which should be parse the input/output from HQL file (ODH/ODS/DWD/DWS/DM/ADS)
class SQLElement(FileElement):
    
    def __get_meta_info(self):
        try:
            sql_text_list = self.get_sentences(remove_set_segment=True)
            result = {TableType.INPUT:set(), TableType.OUTPUT:set(), 'output_sql':set()}
            for sql_single_sentence in sql_text_list :
                meta_list = analysis(sql_single_sentence, output_name = self.output_name.upper())
                input_table_name_list = [tableItem[1] for tableItem in meta_list if tableItem[0] == TableType.INPUT]
                output_table_name_list = [tableItem[1] for tableItem in meta_list if tableItem[0] == TableType.OUTPUT]
                output_sql_list = [tableItem[1] for tableItem in meta_list if tableItem[0] == 'output_sql']
                for input in input_table_name_list :
                    result[TableType.INPUT].add(input)
                for output in output_table_name_list :
                    result[TableType.OUTPUT].add(output)
                for output_sql in output_sql_list :
                    result['output_sql'].add(output_sql)

            if(self.__check_output and self.output_name.upper() not in result[TableType.OUTPUT]):
                logging.error('Table name and file name unmatched')
                # raise TargetTableException('Table name: {} should be included in output list. SQL path: {}'.format(self.output_name, self.path))
                msg = 'Table name: {} should be included in output list. SQL path: {}'.format(self.output_name, self.path)
                Messager.get_instance().raise_output_unmatched(msg)
            return result
        except Exception:
            logging.error(self.path)
            raise

    def __check_output_table_index(self, output_sql_sentences):
        meta_info = self.__get_columns_from_meta()
        self.__output_index_from_meta = meta_info['physical']
        self.__output_index_from_meta.extend(meta_info['partition'])

        for output_sql in output_sql_sentences:
            self.__output_index_from_scan = output_index(output_sql, output_name = self.output_name.upper())
            for index_from_scan in self.__output_index_from_scan:
                # TODO: check out confirmed and probably columns unmatched exception
                if(index_from_scan != self.__output_index_from_meta):
                    logging.error('Table construct columns index/count unmatched between metadata and running script')
                    # raise TargetTableConstructIndexException('Table name: {} / SQL path: {} columns index/count unmatched {} defined in metadata but {} in running script'.format(self.output_name, self.path, self.__output_index_from_meta, index_from_scan))
                    msg = 'Table name: {} / SQL path: {} columns index/count unmatched {} defined in metadata but {} in running script'.format(self.output_name, self.path, self.__output_index_from_meta, index_from_scan)
                    Messager.get_instance().raise_insert_columns_unmatched_confirm(msg)
            
    def __get_columns_from_meta(self):
        output_tables_info = self.output_name.split('.')
        sql_text_physical_columns = 'SELECT t4.COLUMN_NAME FROM TBLS t1 INNER JOIN DBS t2 ON t1.DB_ID = t2.DB_ID INNER JOIN SDS t3 ON t1.SD_ID = t3.SD_ID INNER JOIN COLUMNS_V2 t4 ON t3.CD_ID = t4.CD_ID WHERE t2.NAME = \'{0}\' AND t1.TBL_NAME = \'{1}\' ORDER BY t4.INTEGER_IDX'.format(output_tables_info[0], output_tables_info[1])
        sql_text_partition_columns = 'SELECT PKEY_NAME FROM TBLS t1 INNER JOIN DBS t2 ON t1.DB_ID= t2.DB_ID JOIN hive.PARTITION_KEYS t3 ON t1.TBL_ID = t3.TBL_ID WHERE  t2.NAME=\'{0}\' AND t1.TBL_NAME = \'{1}\' ORDER BY t3.INTEGER_IDX'.format(output_tables_info[0], output_tables_info[1])
        columns_index_physical = list(map(lambda item: item[0].upper(), mysql_ops.get_list(sql_text_physical_columns)))
        columns_index_partition = list(map(lambda item: item[0].upper(), mysql_ops.get_list(sql_text_partition_columns)))
        return {'physical':columns_index_physical, 'partition':columns_index_partition}

    def __get_name(self):
        return self.path.split('/')[-1].replace('.hql', '')

    def __fill(self):        
        self.__name = self.__get_name()
        meta_data = self.__get_meta_info()
        self.__check_output_table_index(meta_data['output_sql'])
        self.__input = tuple(sorted(meta_data[TableType.INPUT]))
        self.__output = tuple(sorted(meta_data[TableType.OUTPUT]))

    def __init__(self, path, local_etl_home, server_etl_home, alias_prefix = [], check_output = True):
        super().__init__(path, local_etl_home, server_etl_home)
        self.__alias_prefix = alias_prefix
        self.__check_output = check_output
        self.__fill()
    
    @property
    def name(self):
        return self.__name

    @property
    def input(self):
        return self.__input
    
    @property
    def output(self):
        return self.__output

    @property
    def output_name(self):
        result = self.show_name.lower()
        if(self.layer.value < Layer.DWD.value):
            return result
        else:
            for alias in self.__alias_prefix:
                result = result.replace(alias + '_', '')
            return result
    
    @property
    def reference_name(self):
        return self.show_name.lower()

#Use on ods function / partition elements scan
class ScanSQLElement(SQLElement):

    @property
    def partitions(self):
        return self.__partitions
    
    @property
    def functions(self):
        return self.__functions

    @property
    def upstreams(self):
        return self.__upstreams

    def __get_scan_elements(self):
        sql_text_list = self.get_sentences(remove_set_segment=True)
        result = []
        for single_sql_sentence in sql_text_list:
            result.extend(scan_specific(single_sql_sentence))
    
        downstream = set(self.output)
        upstream = set(self.input)
        self.__upstreams = upstream - downstream

        for r in result:
            if(isinstance(r, TablePartition)):
                self.__partitions.append(r)
            if(isinstance(r, FunctionElement)):
                self.__functions.append(r)

    def __init__(self, path, local_etl_home, server_etl_home, alias_prefix=[]):
        super().__init__(path, local_etl_home, server_etl_home, alias_prefix=alias_prefix)
        self.__partitions = []
        self.__functions = []
        self.__upstreams = []
        self.__get_scan_elements()

    def __str__(self):
        return 'show name: {0} | header: {1} | partition: {2} | function: {3} | upstream: {4}'.format(self.show_name, self.header, [partition.__str__() for partition in self.partitions], [function.__str__() for function in self.functions], self.upstreams)

    def description(self):
        return {'show_name':self.show_name, 'header':self.header, 'upstream':list(self.upstreams), 'partitions':[partition.description() for partition in self.partitions], 'functions': [function.description() for function in self.functions]}

#Use on stg select items order and content check between stg ops and table init script
class STGElement(FileElement):
    
    @property
    def item_from_meta(self):
        return self.__items_from_meta

    @property
    def item_from_scan(self):
        return self.__items_from_scan

    def __get_scan_elements(self):
        sql_text_list = self.get_sentences(remove_set_segment=True)
        if(len(sql_text_list) == 1):
            return items_select(sql_text_list[0])

    def __init__(self, path, local_etl_home, server_etl_home):
        super().__init__(path, local_etl_home, server_etl_home)
        self.__compare_meta_elements()
    
    def __compare_meta_elements(self):
        output_tables_info = self.output_name.split('.')
        sql_text = 'SELECT  t4.COLUMN_NAME FROM TBLS t1 INNER JOIN DBS t2 ON t1.DB_ID= t2.DB_ID INNER JOIN SDS t3 ON t1.SD_ID = t3.SD_ID INNER JOIN COLUMNS_V2 t4 ON t3.CD_ID= t4.CD_ID WHERE t2.NAME=\'{0}\' AND t1.TBL_NAME = \'{1}\' ORDER BY t4.INTEGER_IDX'.format(output_tables_info[0], output_tables_info[1])
        self.__items_from_meta = list(map(lambda item: item[0].upper(), mysql_ops.get_list(sql_text)))
        self.__items_from_scan = self.__get_scan_elements()

    def is_same(self):
        return self.item_from_meta == self.item_from_scan
    

if __name__ == '__main__' :
    # fileEle = FileElement('/home/sam/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl')
    # print(fileEle)
    # # print(fileEle.get_sentences(remove_set_segment=True))
    # print(fileEle.get_sentences(remove_set_segment=False))
    # print(fileEle.input)
    # print(fileEle.output)

    # sqlEle = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_itm_pmt_price_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle)
    # print(sqlEle.get_sentences(remove_set_segment=False))
    # print(sqlEle.input)
    # print(sqlEle.output)

    # sqlEle2 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle2)
    # print(sqlEle2.get_sentences(remove_set_segment=False))
    # print(sqlEle2.input)
    # print(sqlEle2.output)

    # sqlEle3 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_mov_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle3)
    # print(sqlEle3.get_sentences(remove_set_segment=False))
    # print(sqlEle3.input)
    # print(sqlEle3.output)

    # sqlEle4 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_str_mon_mi.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle4)
    # print(sqlEle4.get_sentences(remove_set_segment=False))
    # print(sqlEle4.input)
    # print(sqlEle4.output)

    
    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_mbr_trf_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_mov_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/ods/ops/sap_ep1_bseg.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/ods/ops/sap_ep1_bseg.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_mov_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    print(sqlEle5)
    print(sqlEle5.get_sentences(remove_set_segment=False))
    print(sqlEle5.input)
    print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/itn_fct_trx_mbr_life_detail_di_repurchase.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_trx_mbr_ss_perform_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)

    # sqlEle5 = SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_order_tag_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11', 'mp27'])
    # print(sqlEle5)
    # print(sqlEle5.get_sentences(remove_set_segment=False))
    # print(sqlEle5.input)
    # print(sqlEle5.output)


    # scanEle1 = ScanSQLElement('/home/sam/cheetah_etl/src/ods/ops/pos_midplat_posm04_items.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl')
    # scanEle1 = ScanSQLElement('/home/sam/cheetah_etl/src/ods/ops/mlp11_order_so_item.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl')
    # print(scanEle1)
    # print(scanEle1.description())
    # print(scanEle1)
    # print(scanEle1.get_sentences(remove_set_segment=False))
    # print(scanEle1.header)
    # print(scanEle1.input)
    # print(scanEle1.output)
    

    # fileEle2 = STGElement('/home/sam/cheetah_etl/src/stg/ops/[sap].[ep1].[a809].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl')
    # print(fileEle2.is_same())

    # fileEle_list = [fileEle, fileEle2]
    # print('fileEle_list')
    # print(fileEle_list)

    # fileEle_set = set()
    # fileEle_set.add(fileEle)
    # fileEle_set.add(fileEle2)
    # print('fileEle_set')
    # print(fileEle_set)

    # fileEle_dict = {}
    # fileEle_dict[fileEle] = fileEle
    # fileEle_dict[fileEle2] = fileEle
    # print('fileEle_dict')
    # print(fileEle_dict)


    # sqlEle2 = SQLElement('/home/sam/cheetah_etl/src/ods/ops/pos_midplat_posm04_root.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', [])
    # print(sqlEle2)