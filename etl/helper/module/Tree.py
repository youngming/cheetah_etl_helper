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
        self.append_upstream(tree_node_inputed)

    def downstream_listener_callback(self, tree_node_innputed):
        self.append_downstream(tree_node_innputed)

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
        
        for tree_node_item in tree_node_set:
            if(self.__element != tree_node_item.element):
                self.__upstream.add(tree_node_item)

    def append_downstream(self, tree_node):
        if(isinstance(tree_node, TreeNode)):
            tree_node_set = set()
            tree_node_set.add(tree_node)

        for tree_node_item in tree_node_set:
            if(self.__element != tree_node.element):
                self.__downstream.add(tree_node)

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
                    # Tree._instance.__input = {}
                    Tree._instance.__input_listener = {}  
        return Tree._instance

    @property
    def nodes(self):
        return self.__nodes

    def append_node(self, tree_node):
        #Raise an exception when push a same tree node in(same element)
        if(tree_node.element.path in self.__nodes):
            raise TreeNodeDuplicateException('path: {} has existed in node list'.format(tree_node.element.path))
                
        self.__nodes[tree_node.element.path] = tree_node

        #Publish the append tree node's output into board (key=element path / value=append tree node)
        for output_item in tree_node.element.output:
            if(output_item not in self._instance.__output):
                self._instance.__output[output_item] = set()
            self._instance.__output[output_item].add(tree_node)
        
        #Match the append tree node's input requirement. 
        #Inject the related input tree node into when matched then put in input listener list
        #(output can be contributed from more than one. Sometime the next one be added in the future)
        for input_item in tree_node.element.input:
            if(input_item in self._instance.__output):
                tree_node.append_upstream(self._instance.__output[input_item])
            # else:

        

if __name__ == '__main__':
    tree = Tree()
    tree2 = Tree()
    tree3 = Tree()
    print(tree.nodes)
    fileEle = FileElement('/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql')
    sqlEle = SQLElement('/home/sam/works/cheetah_etl/src/ods/ops/sap_ep1_ztsd_051.hql')
    tree_node_file = TreeNode(fileEle)
    tree_node_sql = TreeNode(sqlEle)
    tree_node_file.append_upstream(tree_node_sql)
    tree_node_file.append_downstream(tree_node_sql)
    tree4 = Tree(tree_node_file)
    tree5 = Tree()
    print(tree5.nodes)
    print(tree.nodes)
    print(tree4.nodes)
    print(tree4.nodes['/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql'].upstream)
    print(tree4.nodes['/home/sam/works/cheetah_etl/src/stg/ops/[mdm].[hap_prd].[hmdm_md_attr_10002].sql'].downstream)



    print(tree)
    print(tree2)
    print(tree3)
    print(tree4)
    print(tree5)
    


