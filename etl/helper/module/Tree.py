from etl.helper.module.ETL_element import ElementBase, FileElement, SQLElement
import threading

class TreeNodeDuplicateException(Exception):
    pass

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

    @property
    def upstream(self):
        return self.__upstream

    @property
    def downstream(self):
        return self.__downstream

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
        return self.__upstream

    @property
    def downstream(self):
        return self.__downstream

    def __hash__(self):
        return self.__element.__hash__()
    
    def __eq__(self, other):
        if(isinstance(other, TreeNode)):
            return self.__element.__eq__(other.element)

class Tree(object):

    _instance_lock = threading.Lock()

    def __init__(self, tree_node = None):
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
        return Tree._instance

    @property
    def nodes(self):
        return self.__nodes

    def append_node(self, tree_node):
        #Raise an exception when push a same tree node in(same element)
        if(tree_node.element.path in self.__nodes):
            raise TreeNodeDuplicateException('path: {} has existed in node list'.format(tree_node.element.path))
                
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

    node_dws_fct_ass_hourly_di = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dws/ops/fct_ass_hourly_di.hql'))
    node_dwd_fct_ass_ord_item_id = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_ass_ord_item_di.hql'))
    node_dwd_dim_hour = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/dim_hour.hql'))
    node_dwd_fct_ass_paytype_ord_di = TreeNode(SQLElement('/home/sam/works/cheetah_etl/src/dwd/ops/fct_ass_paytype_ord_di.hql'))

    tree = Tree()
    tree.append_node(node_dwd_dim_hour)
    tree.append_node(node_dwd_fct_ass_ord_item_id)
    tree.append_node(node_dwd_fct_ass_paytype_ord_di)
    tree.append_node(node_dws_fct_ass_hourly_di)

    print(node_dws_fct_ass_hourly_di.element.input)
    print(node_dws_fct_ass_hourly_di.element.output)

    print(node_dwd_fct_ass_ord_item_id.element.input)
    print(node_dwd_fct_ass_ord_item_id.element.output)

    print(node_dwd_dim_hour.element.input)
    print(node_dwd_dim_hour.element.output)

    print(node_dwd_fct_ass_paytype_ord_di.element.input)
    print(node_dwd_fct_ass_paytype_ord_di.element.output)
    


