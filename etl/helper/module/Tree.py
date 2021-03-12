from etl.helper.module.ETL_element import ElementBase, FileElement, SQLElement
import threading
import logging
from etl.helper.module.Messager import Messager

#Throw this exception when same tree node be inputed into tree more than once
# class TreeNodeDuplicateException(Exception):
#     pass

class TreeNode(object):
    def __init__(self, etl_element):
        self.__element = etl_element
        self.__upstream = set()
        self.__downstream = set()

    def upstream_listener_callback(self, tree_node_inputed):
        self.append_downstream(tree_node_inputed)

    def downstream_listener_callback(self, tree_node_inputed):
        self.append_upstream(tree_node_inputed)

    @property
    def element(self):
        return self.__element

    def append_upstream(self, tree_node):
        if(isinstance(tree_node, TreeNode)):
            tree_node_set = set()
            tree_node_set.add(tree_node)
        else:
            tree_node_set = tree_node
        
        for tree_node_item in tree_node_set:
            if(self.__element != tree_node_item.element):
                self.__upstream.add(tree_node_item)

    def append_downstream(self, tree_node):
        if(isinstance(tree_node, TreeNode)):
            tree_node_set = set()
            tree_node_set.add(tree_node)
        else:
            tree_node_set = tree_node

        for tree_node_item in tree_node_set:
            if(self.__element != tree_node_item.element):
                self.__downstream.add(tree_node_item)

    @property
    def upstream(self):
        return sorted(self.__upstream)

    @property
    def downstream(self):
        return sorted(self.__downstream)

    def __hash__(self):
        return self.__element.__hash__()
    
    def __eq__(self, other):
        if(isinstance(other, TreeNode)):
            return self.__element.__eq__(other.element)

    def __lt__(self, other):
        if(isinstance(other, TreeNode)):
            return self.element.name < other.element.name
    
    def description(self):
        return {
            'name':self.element.name, 
            'layer':self.element.layer.name, 
            'show_name':self.element.show_name,
            'output_name':self.element.output_name, 
            'reference_name':self.element.reference_name, 
            'path':self.element.server_path, 
            'sql':self.element.get_sentences() , 
            'header':self.element.header, 
            'upstream':[up.element.show_name for up in self.upstream], 
            'downstream':[down.element.show_name for down in self.downstream]}


class Tree(object):
    _instance_lock = threading.Lock()

    def __init__(self, tree_node = None, depth_limit_same_layer = None):
        if tree_node:
            self.append_node(tree_node)

    def __new__(cls, *args, **kwargs):
        if not hasattr(Tree, "_instance"):
            with Tree._instance_lock:
                if not hasattr(Tree, "_instance"):
                    Tree._instance = object.__new__(cls)
                    Tree._instance.__nodes = {}
                    Tree._instance.__output = {}
                    Tree._instance.__input = {}
                    Tree._instance.__depth_limit = kwargs.get('depth_limit_same_layer', None)
        return Tree._instance

    @property
    def nodes(self):
        return self.__nodes

    def append_node(self, tree_node):
        #Raise an exception when push a same tree node in(same element)
        if(tree_node.element.path in self.__nodes):
            # raise TreeNodeDuplicateException('path: {} has existed in node list'.format(tree_node.element.path))
            msg = 'path: {} has existed in node list'.format(tree_node.element.path)
            Messager.get_instance().raise_item_duplicated(msg)
                
        self.__nodes[tree_node.element.path] = tree_node

        #Publish the append tree node's input / output into board (key=element path / value=append tree node)
        #Set the own upstream / downstream when input output wish list existed
        #Refresh all input / output wish list
        for output_item in tree_node.element.output:
            if(output_item not in self._instance.__output):
                self._instance.__output[output_item] = set()
            self._instance.__output[output_item].add(tree_node)

            if(output_item in self._instance.__input):
                tree_node.append_downstream(self._instance.__input[output_item])
                for input_wait in self._instance.__input[output_item]:
                    input_wait.downstream_listener_callback(tree_node)
            


        for input_item in tree_node.element.input:
            if(input_item not in self._instance.__input):
                self._instance.__input[input_item] = set()
            self._instance.__input[input_item].add(tree_node)

            if(input_item in self._instance.__output):
                tree_node.append_upstream(self._instance.__output[input_item])
                for output_wait in self._instance.__output[input_item]:
                    output_wait.upstream_listener_callback(tree_node)

    def __check_depth_process(self, current_node, limitation, current_layer=None, current_count=0, through_path=[]):
        if(current_layer == None and len(through_path) == 0):
            if(len(current_node.downstream) > 0):
                through_path.append(current_node.element.show_name)
                for downstream_node in current_node.downstream:
                    yield from self.__check_depth_process(downstream_node, limitation, current_node.element.layer, current_count, list(through_path))
        else:
            if(current_node.element.layer == current_layer):
                current_count += 1
                through_path.append(current_node.element.show_name)
                if(current_count > limitation):
                    if('depth_limit' not in current_node.element.header.keys() or current_count > int(current_node.element.header['depth_limit'])):
                        yield '->'.join(through_path)
                        through_path.pop()
                elif (len(current_node.downstream) >0):
                    for downstream_node in current_node.downstream:
                        yield from self.__check_depth_process(downstream_node, limitation, current_node.element.layer, current_count, list(through_path))
            elif(len(current_node.downstream) > 0):
                current_count = 0
                through_path = []
                through_path.append(current_node.element.show_name)
                for downstream_node in current_node.downstream:
                    yield from self.__check_depth_process(downstream_node, limitation, current_node.element.layer, current_count, list(through_path))

    def check_depth(self, depth_limit = None):
        depth_limit_final = depth_limit    
        if((self.__depth_limit == None or self.__depth_limit < 0) and (depth_limit == None or depth_limit < 0)):
            logging.info('There is no depth limitation requirement inputed')
            return

        if(depth_limit_final == None):
            depth_limit_final = self.__depth_limit

        tmp_list = []
        for path, node in self.nodes.items():
            tmp_list.extend(list(self.__check_depth_process(node, depth_limit_final)))

        result = set()
        for i in tmp_list:
            result.add(i)

        return result        

if __name__ == '__main__':
    # tree = Tree()
    # tree2 = Tree()
    # tree3 = Tree()
    # print(tree.nodes)
    # fileEle = FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql')
    # sqlEle = SQLElement('/home/sam/works/cheetah_etl/src/ods/ops/sap_ep1_ztsd_051.hql')
    # tree_node_file = TreeNode(fileEle)
    # tree_node_sql = TreeNode(sqlEle)
    # # tree_node_file.append_upstream(tree_node_sql)
    # # tree_node_file.append_downstream(tree_node_sql)
    # tree4 = Tree(tree_node_file)
    # tree5 = Tree(tree_node_sql)
    # print(tree5.nodes)
    # print(tree.nodes)
    # print(tree4.nodes)
    # print(tree4.nodes['/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql'].upstream)
    # print(tree4.nodes['/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql'].downstream)



    # print(tree)
    # print(tree2)
    # print(tree3)
    # print(tree4)
    # print(tree5)

    # node_dws_fct_ass_hourly_di = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dws/ops/fct_ass_hourly_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_fct_ass_ord_item_id = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_ass_ord_item_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_dim_hour = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/dim_hour.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_fct_ass_paytype_ord_di = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_ass_paytype_ord_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_dim_merchant = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/dim_merchant.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_ods_mlp_oms_so_return = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/ods/ops/mlp_oms_so_return.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    
    # node_dwd_dim_item = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/dim_item.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_fct_item_sourcing_df = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_itm_sourcing_df.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_dwd_fct_item_price_df = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_item_price_df.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_ods_mdm_hap_prd_hmdm_md_attr_10005 = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/ods/ops/mdm_hap_prd_hmdm_md_attr_10005.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    
    # node_stg_biweb_aldi_board_cs_import_data = TreeNode(FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[biweb].[aldi_board].[cs_import_data].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_ods_biweb_aldi_board_cs_import_data = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/ods/ops/biweb_aldi_board_cs_import_data.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_stg_impt_cheetah_calendar = TreeNode(FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[impt].[cheetah].[calendar].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_stg_impt_cheetah_holiday = TreeNode(FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[impt].[cheetah].[holiday].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_stg_impt_cheetah_impt_buying_m_d_mapping = TreeNode(FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[impt].[cheetah].[impt_buying_m_d_mapping].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))
    # node_stg_impt_cheetah_impt_channel_m = TreeNode(FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[impt].[cheetah].[impt_channel_m].sql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl'))

    # print(node_stg_biweb_aldi_board_cs_import_data.description())

    node_fct_itm_pmt_price_di = TreeNode(SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_itm_pmt_price_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11']))
    node_fct_stock_cost_di = TreeNode(SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11']))
    node_fct_stock_mov_cost_di = TreeNode(SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_stock_mov_cost_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11']))
    node_fct_str_mon_mi = TreeNode(SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_str_mon_mi.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11']))
    node_fct_itm_cost_price_summary_di = TreeNode(SQLElement('/home/sam/cheetah_etl/src/dm/ops/fct_itm_cost_price_summary_di.hql', '/home/sam/cheetah_etl', '/home/sam/works/cheetah_etl', ['mp11']))

    tree = Tree(depth_limit_same_layer=1)

    tree.append_node(node_fct_itm_pmt_price_di)
    tree.append_node(node_fct_stock_cost_di)
    tree.append_node(node_fct_stock_mov_cost_di)
    tree.append_node(node_fct_str_mon_mi)
    tree.append_node(node_fct_itm_cost_price_summary_di)

    print(tree)

    tree.check_depth()

    # tree.append_node(node_dwd_dim_hour)
    # tree.append_node(node_dwd_fct_ass_ord_item_id)
    # tree.append_node(node_dwd_fct_ass_paytype_ord_di)
    # tree.append_node(node_dws_fct_ass_hourly_di)
    # tree.append_node(node_dim_merchant)
    # tree.append_node(node_mlp_oms_so_return)

    # tree.append_node(node_dwd_dim_item)
    # tree.append_node(node_dwd_fct_item_sourcing_df)
    # tree.append_node(node_dwd_fct_item_price_df)
    # tree.append_node(node_ods_mdm_hap_prd_hmdm_md_attr_10005)

    # tree.append_node(node_stg_biweb_aldi_board_cs_import_data)
    # tree.append_node(node_ods_biweb_aldi_board_cs_import_data)
    # tree.append_node(node_stg_impt_cheetah_calendar)
    # tree.append_node(node_stg_impt_cheetah_holiday)
    # tree.append_node(node_stg_impt_cheetah_impt_buying_m_d_mapping)
    # tree.append_node(node_stg_impt_cheetah_impt_channel_m)

    error = tree.check_depth()
    print(error)
    # print(node_dws_fct_ass_hourly_di.element.input)
    # print(node_dws_fct_ass_hourly_di.element.output)

    # print(node_dwd_fct_ass_ord_item_id.element.input)
    # print(node_dwd_fct_ass_ord_item_id.element.output)

    # print(node_dwd_dim_hour.element.input)
    # print(node_dwd_dim_hour.element.output)

    # print(node_dwd_fct_ass_paytype_ord_di.element.input)
    # print(node_dwd_fct_ass_paytype_ord_di.element.output)
     


