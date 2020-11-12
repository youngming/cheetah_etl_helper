from etl.helper.module.properties import Layer
from etl.helper.utils.common.file_operation import read_txt
from etl.helper.utils.sql.sql_analyzer import TableType, analysis
from functools import reduce
import logging
import re


# All HQL element base class
class SQLBase(object):
    pass


# HQL element which can get all info from file name (STG)
class FileElement(SQLBase):
    
    def __get_layer(self):
        return Layer[self.__path.split('/')[-3].upper()]
    
    def __parse_sql_header(self):
        header_list = re.findall(r'--.*?=.*?\n', self.__sql_text)
        header_list = list(map(lambda head_item : re.sub(r'--', '', head_item).strip(), header_list))
        result = {}
        for header_item in header_list : 
            result[header_item.split('=')[0]] = header_item.split('=')[1]
        return result
    
    def __get_output(self):
        file_name = self.__path.split('/')[-1].upper()
        table_segments = file_name.replace('[', '').replace(']', '').strip().split('.')[0:-1]
        output_table = str(self.layer.name + '.' + reduce(lambda tp1, tp2: tp1 + '_' + tp2, table_segments))
        return (output_table,)

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
        self.__sql_text = read_txt(self.__path)
        self.__layer = self.__get_layer()
        self.__header = self.__parse_sql_header()

    def __init__(self, path):
        self.__path = path
        self.__fill()

    @property
    def path(self):
        return self.__path

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
            'header:{} | layer:{} | path:{} | input:{} | output:{}', 
            self.header, 
            self.layer, 
            self.path, 
            self.input, 
            self.output)


# HQL element which should be parse the input/output from HQL file (ODH/ODS/DWD/DWS/DM/ADS)
class SQLElement(FileElement):
    
    def __get_meta_info(self):
        sql_text_list = self.get_sentences(remove_set_segment=True)
        result = {TableType.INPUT:set(), TableType.OUTPUT:set()}
        for sql_singel_sentence in sql_text_list :
            meta_list = analysis(sql_singel_sentence)
            input_table_name_list = [tableItem[1] for tableItem in meta_list if tableItem[0] == TableType.INPUT]
            output_table_name_list = [tableItem[1] for tableItem in meta_list if tableItem[0] == TableType.OUTPUT]
            for input in input_table_name_list :
                result[TableType.INPUT].add(input)
            for output in output_table_name_list :
                result[TableType.OUTPUT].add(output)
        return result

    def __fill(self):        
        meta_data = self.__get_meta_info()
        self.__input = tuple(meta_data[TableType.INPUT])
        self.__output = tuple(meta_data[TableType.OUTPUT])

    def __init__(self, path):
        FileElement.__init__(self, path)
        self.__fill()
    
    @property
    def input(self):
        return self.__input
    
    @property
    def output(self):
        return self.__output


if __name__ == '__main__' :
    fileEle = FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql')
    print(fileEle)
    # print(fileEle.get_sentences(remove_set_segment=True))
    print(fileEle.get_sentences(remove_set_segment=False))
    print(fileEle.input)
    print(fileEle.output)

    sqlEle = SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_ass_ord_item_di.hql')
    print(sqlEle)
    print(sqlEle.get_sentences(remove_set_segment=False))
    print(sqlEle.input)
    print(sqlEle.output)