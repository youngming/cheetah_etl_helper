import jnius_config
import logging
#logging.getLogger().setLevel(logging.INFO)
import os
file_abs_path = os.path.dirname(os.path.abspath(__file__))
jnius_config.set_classpath(file_abs_path + '/grammar/sql-grammar.jar',file_abs_path + '/grammar/antlr-3.5.2-complete.jar')
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

class ItemDuplicatedException(Exception):
    pass

def __walktree(node,depth = 0):
    print("%s%s=%s" % (str(depth) + "  "*depth,node.getText(),node.getType()))
    children = node.children
    if not children:
        return
    ch_size = children.size()
    for i in range(ch_size):
        ch =children.get(i)
        __walktree(ch,depth + 1)       

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
    
    # Check group by duplicated
    if(node_inputed.getType() == tokens.TOK_GROUPBY): 
        __check_groupby_duplication(node_inputed)

    if(node_inputed.getType() == tokens.TOK_TABNAME):
        table_name_nodes = node_inputed.children
        if(len(table_name_nodes) == 1):
            yield (type, table_name_nodes[0].getText(), is_temporary)
        else:
            yield (type, reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), table_name_nodes), is_temporary)
        
    else:
        child_nodes = node_inputed.children
        if(child_nodes != None):
            for child_node in child_nodes:
                yield from __find_table_name(child_node, type, is_temporary)

def __check_groupby_duplication(node_inputed):
    groupby_children_items = list(filter(lambda node: node.getType() != tokens.TOK_FUNCTION, node_inputed.children))
    group_input_size = len(groupby_children_items)
    group_item_s = set()
    for groupby_child in groupby_children_items: 
        if(groupby_child.getType() == tokens.TOK_TABLE_OR_COL):
            # Table name directly without alias name before
            if(len(groupby_child.children) == 1):
                group_item_s.add(groupby_child.children[0].getText())
            else:
                group_item_s.add(reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), groupby_child.children))

        else: 
            alias_groupby_children_items = groupby_child.children
            tmp_groupby_name = ''
            for alias_groupby_child in alias_groupby_children_items: 
                if(alias_groupby_child.getType() == tokens.TOK_TABLE_OR_COL): 
                    if(len(alias_groupby_child.children) == 1):
                        tmp_groupby_name += alias_groupby_child.children[0].getText() + '.'
                    else:
                        tmp_groupby_name += reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), alias_groupby_child.children) + '.'
                else:
                    tmp_groupby_name += alias_groupby_child.getText()
            group_item_s.add(tmp_groupby_name)


    if(group_input_size != len(group_item_s)): 
        duplication_msg = '{} is duplicated inputed {} but {} actually. They are {}'.format(node_inputed.getText(), group_input_size, len(group_item_s), group_item_s)
        raise ItemDuplicatedException(duplication_msg)     

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
    try:
        logging.info(single_sql_sentence)
        sql_string = single_sql_sentence.upper()
        sqlstream = StringStream(sql_string)
        inst = Lexer(sqlstream)
        ts = TokenStream(inst)
        parser = Parser(ts)
        ret  = parser.statement()
        treeroot = ret.getTree()
        # __walktree(treeroot)
        return [table_meta for table_meta in __find_table_name(treeroot)]
    except Exception:
        logging.error(single_sql_sentence)
        raise
    
if __name__=='__main__':
    # __test()
    #sql_string = "CREATE TEMPORARY TABLE IF NOT EXISTS  tmp.dwd_aldi_msap09_so_item_tmp_base_all AS SELECT id,msap09_so_id,itemid FROM ods.mlp_finance_aldi_msap09_so_item WHERE pt_create_time IN (SELECT ods.pt_create_time FROM tmp.dwd_tmp_aldi_msap09_so_item_incr tmp JOIN ods.mlp_finance_aldi_msap09_so_item ods ON ods.id = tmp.id GROUP BY ods.pt_create_time)"
    #sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY hm.MD_CODE, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10047, hma5.C_10048, he.NAME, bmdm.buying_director, scvb1.DESCRIPTION, scvb2.DESCRIPTION, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10080, hma5.C_10081, hma5.C_10082, hma5.C_10083, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10216, hma5.C_10217, scvb3.DESCRIPTION, scvb4.DESCRIPTION, bc.ZB_P_L, pam.product_source, scvb5.DESCRIPTION, scvb6.DESCRIPTION"
    #sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY MD_CODE, C_10044, C_10050, C_10051, C_10039, C_10054, C_10055, C_10085, C_10086, C_10087, C_10089, C_10047, C_10048, NAME, buying_director, DESCRIPTION, DESCRIPTION, C_10053, C_10079, C_10097, C_10080, C_10081, C_10082, C_10083, C_10085, C_10086, C_10087, C_10089, C_10216, C_10217, DESCRIPTION, DESCRIPTION, ZB_P_L, product_source, DESCRIPTION, DESCRIPTION"
    #sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY hm.MD_CODE, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10047, hma5.C_10048, he.NAME, bmdm.buying_director, scvb1.DESCRIPTION, scvb2.DESCRIPTION, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10080, hma5.C_10081, hma5.C_10082, hma5.C_10083, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10216, hma5.C_10217, scvb3.DESCRIPTION, scvb4.DESCRIPTION, bc.ZB_P_L, pam.product_source, scvb5.DESCRIPTION, scvb6.DESCRIPTION"
    #sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY MD_CODE, C_10044, C_10050, C_10051, C_10039, C_10054, C_10055, C_10085, C_10086, C_10087, C_10089, C_10047, C_10048, NAME, buying_director, C_10053, C_10079, C_10097, C_10080, C_10081, C_10082, C_10083, C_10216, C_10217, ZB_P_L, product_source, DESCRIPTION"
    #sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY hm.MD_CODE, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10047, hma5.C_10048, he.NAME, bmdm.buying_director, scvb1.DESCRIPTION, scvb2.DESCRIPTION, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10080, hma5.C_10081, cast(dmc.pk_merchant_id as bigint), hma5.C_10083, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10216, hma5.C_10217, scvb3.DESCRIPTION, scvb4.DESCRIPTION, bc.ZB_P_L, pam.product_source, scvb5.DESCRIPTION, scvb6.DESCRIPTION"
    sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY hm.MD_CODE, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10047, hma5.C_10048, he.NAME, bmdm.buying_director, scvb1.DESCRIPTION, scvb2.DESCRIPTION, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10080, hma5.C_10081, cast(dmc.pk_merchant_id as bigint), cast(dmc.pk_merchant_id as bigint), cast(dmc.pk_merchant_id as bigint), cast(hma5.C_10085 as bigint), hma5.C_10083, C_10085, C_10086, C_10087, C_10089, hma5.C_10216, hma5.C_10217, scvb3.DESCRIPTION, scvb4.DESCRIPTION, bc.ZB_P_L, pam.product_source, scvb5.DESCRIPTION, scvb6.DESCRIPTION"    
    result = analysis(sql_string)
    print(result)

    
