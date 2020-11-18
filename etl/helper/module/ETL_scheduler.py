from etl.helper.utils.common.file_operation import search_files_in_folder
from etl.helper.module.ETL_element import FileElement, SQLElement
from etl.helper.module.Tree import TreeNode, Tree
import os
from functools import reduce
import logging

#Throw this exception when without ETL_HOME argument inputed
class ArgumentMissingException(Exception):
    pass

#Throw this exception when same layer reference exceeded the limit
class LayerReferenceDepthLimitationException(Exception)::
    pass

class ETLScheduler(object):

    def __init__(self, etl_home=None, depth_limit=None):
        self.__etl_home = etl_home
        self.__depth_limit = depth_limit

        if(self.__etl_home == None):
            self.__etl_home = os.getenv('ETL_HOME')
        
        if(self.__etl_home == None):
            raise ArgumentMissingException('Can not get argument ETL_HOME neither in ETLScheduler constructor input or in os environment.')

        if(self.__depth_limit == None and os.getenv('DEPTHLIMIT') != None):
            self.__depth_limit = int(os.getenv('DEPTHLIMIT'))

    def __get_nodes(self):
        stg_file_gen = list(search_files_in_folder(self.__etl_home + '/src/stg', 'ops', 'sql'))
        others_gen = list(search_files_in_folder(self.__etl_home + '/src', 'ops', 'hql'))
        all_sql_element = []
        for stg_file_list in stg_file_gen:
            for stg_file in stg_file_list:
                all_sql_element.append(FileElement(stg_file))
        for others_file_list in others_gen:
            for others_file in others_file_list:
                all_sql_element.append(SQLElement(others_file))
        
        tree = Tree(depth_limit_same_layer=self.__depth_limit)
        for node in all_sql_element:
            tree.append_node(TreeNode(node)
        self.__tree = tree

        return tree

    def generate_output_files(self):
        if(self.__tree == None):
            self.__tree = self.__get_nodes()

    def check_depth(self):
        if(self.__tree == None):
            self.__tree = self.__get_nodes()
        
        depth_exception_info = self.__tree.check_depth()
        if(depth_exception_infolen != None and depth_exception_infolen(depth_exception_info) != 0):
            logging.error('These reference is exceeded limit {}'.format(depth_exception_info))
            raise LayerReferenceDepthLimitationException(depth_exception_info)



if __name__ == '__main__':
    


    # for path, node in tree.nodes.items():
    #     if(node.element.layer == None): 
    #         print(node.element)


    # error = tree.check_depth()
    # print(error)

    # print(tree)
    # tree.check_depth()

    # for path, node in tree.nodes.items():
    #     print(path)
    #     print(node.element.layer.name)
    #     print(node.element.name)
    #     for up in node.upstream:
    #         print('    ' + up.element.path)
    #         print('    ' + up.element.layer.name)
    #         print('    ' + up.element.name)
        