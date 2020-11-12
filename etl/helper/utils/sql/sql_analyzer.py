import jnius_config
jnius_config.set_classpath('/home/sam/works/cheetah_etl_helper/etl/helper/utils/sql/grammar/sql-grammar.jar','/home/sam/works/cheetah_etl_helper/etl/helper/utils/sql/grammar/antlr-3.5.2-complete.jar')
import jnius
from enum import Enum
from functools import reduce
from etl.helper.utils.sql import tokens
StringStream = jnius.autoclass('org.antlr.runtime.ANTLRStringStream')
Lexer  = jnius.autoclass('grammar.HiveLexer')
Parser  = jnius.autoclass('grammar.HiveParser')
TokenStream  = jnius.autoclass("org.antlr.runtime.CommonTokenStream")

class TableType(Enum):
    INPUT = 1
    OUTPUT = 2

# def __walktree(node,depth = 0):
#     print("%s%s=%s" % (str(depth) + "  "*depth,node.getText(),node.getType()))
#     children = node.children
#     if not children:
#         return
#     ch_size = children.size()
#     for i in range(ch_size):
#         ch =children.get(i)
#         walktree(ch,depth + 1)

def __find_table_name(node_inputed, type_inputed = None, temporary_inputed = False):
    type = type_inputed
    is_temporary = temporary_inputed
    if(node_inputed.getType() in [tokens.TOK_CREATETABLE, tokens.TOK_INSERT]):
        type = TableType.OUTPUT
        if(node_inputed.getType() == tokens.TOK_CREATETABLE):
            is_temporary = len(list(filter(lambda node_item : node_item.getType() == tokens.TEMPORARY, node_inputed.children))) > 0
        else:
            is_temporary = False

    if(node_inputed.getType() in [tokens.TOK_QUERY]):
        type = TableType.INPUT
        is_temporary = False
    
    if(node_inputed.getType() == tokens.TOK_TABNAME):
        table_name_nodes = node_inputed.children
        if(len(table_name_nodes) == 1):
            yield (type, table_name_nodes[0].getText(), is_temporary)
        else:
            yield (type, reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), table_name_nodes), is_temporary)
        return
    else:
        child_nodes = node_inputed.children
        if(child_nodes != None):
            for child_node in child_nodes:
                yield from __find_table_name(child_node, type, is_temporary)
        else:
            return

#def __test():
    # cstream = StringStream("select * from new_tqable;")
    # inst = Lexer(cstream)
    # ts = TokenStream(inst)
    # ts.fill()

    # jlist = ts.getTokens()
    # for i in jlist:
    #     print(i.getText())
    
    # sql_string = "INSERT OVERWRITE TABLE ods.impt_cheetah_impt_buying_m_d_mapping PARTITION (dt='{{ dt }}') SELECT buying_manager,buying_director,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') AS etl_date FROM odh.impt_cheetah_impt_buying_m_d_mapping WHERE  dt='{{ dt }}'"
    #sql_string = "SELECT * FROM ABC.DEF AS TMP WHERE TMP.TIME > '87'"
    #sql_string = "CREATE TEMPORARY TABLE IF NOT EXISTS tmp.dwd_tmp_aldi_msap09_so_item_incr as SELECT id,msap09_so_id,itemid,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') AS etl_date FROM stg.mlp_finance_aldi_msap09_so_item WHERE dt='{{ dt }}'"
    #sql_string = "CREATE TEMPORARY TABLE IF NOT EXISTS  tmp.dwd_aldi_msap09_so_item_tmp_base_all AS SELECT id,msap09_so_id,itemid FROM ods.mlp_finance_aldi_msap09_so_item WHERE pt_create_time IN (SELECT ods.pt_create_time FROM tmp.dwd_tmp_aldi_msap09_so_item_incr tmp JOIN ods.mlp_finance_aldi_msap09_so_item ods ON ods.id = tmp.id GROUP BY ods.pt_create_time)"
    #sql_string = "CREATE TEMPORARY TABLE IF NOT EXISTS  tmp.dwd_tmp_aldi_msap09_so_item_result AS SELECT pfd.id,pfd.msap09_so_id,pfd.itemid FROM tmp.dwd_aldi_msap09_so_item_tmp_base_all pfd LEFT JOIN tmp.dwd_tmp_aldi_msap09_so_item_incr tmp ON pfd.id = tmp.id WHERE tmp.id IS NULL"
    #sql_string = "insert overwrite table dwd.fct_item_price_df SELECT mhphmh.c_10144 AS pk_fk_item_code,'' AS pk_fk_merchant_code,mhphmh.c_10169 AS currency,mhphmh.c_10170 AS price_unit,mhphmh.c_10171 AS qty_unit,from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') AS etl_date FROM ods.mdm_hap_prd_hmdm_md_his_10002 mhphmh JOIN  dwd.dim_channel dc ON  mhphmh.c_10249=dc.source_channel_id AND dc.sys_type=\"MDM\" LEFT JOIN  dwd.dim_item di ON  mhphmh.c_10144=di.pk_item_code"
    
    # sql_string = sql_string.upper()
    # print(sql_string)
    # sqlstream = StringStream(sql_string)
    # inst = Lexer(sqlstream)
    # ts = TokenStream(inst)
    # parser = Parser(ts)
    # ret  = parser.statement()
    # treeroot = ret.getTree()

    # for t in __find_table_name(treeroot):
    #     print(t)

def analysis(single_sql_sentence):
    sql_string = single_sql_sentence.upper()
    sqlstream = StringStream(sql_string)
    inst = Lexer(sqlstream)
    ts = TokenStream(inst)
    parser = Parser(ts)
    ret  = parser.statement()
    treeroot = ret.getTree()
    return [table_meta for table_meta in __find_table_name(treeroot)]


if __name__=='__main__':
    # __test()
    sql_string = "CREATE TEMPORARY TABLE IF NOT EXISTS  tmp.dwd_aldi_msap09_so_item_tmp_base_all AS SELECT id,msap09_so_id,itemid FROM ods.mlp_finance_aldi_msap09_so_item WHERE pt_create_time IN (SELECT ods.pt_create_time FROM tmp.dwd_tmp_aldi_msap09_so_item_incr tmp JOIN ods.mlp_finance_aldi_msap09_so_item ods ON ods.id = tmp.id GROUP BY ods.pt_create_time)"
    result = analysis(sql_string)
    print(result)

    
