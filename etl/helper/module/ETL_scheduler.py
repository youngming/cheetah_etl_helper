from etl.helper.utils.common.file_operation import search_files_in_folder
from etl.helper.module.ETL_element import FileElement, SQLElement
from etl.helper.module.Tree import TreeNode, Tree
import os
from functools import reduce

class ETLScheduler(object):

    def __init__(self, etl_home):
        self.__etl_home = etl_home

    def get_nodes(self):
        stg_file_gen = list(search_files_in_folder(self.__etl_home + '/src/stg', 'ops', 'sql'))
        others_gen = list(search_files_in_folder(self.__etl_home + '/src', 'ops', 'hql'))
        all_sql_element = []
        for stg_file_list in stg_file_gen:
            for stg_file in stg_file_list:
                all_sql_element.append(FileElement(stg_file))
        for others_file_list in others_gen:
            for others_file in others_file_list:
                all_sql_element.append(SQLElement(others_file))
        return all_sql_element



if __name__ == '__main__':
    scheduler = ETLScheduler(os.getenv('ETL_HOME'))
    all_nodes_list = scheduler.get_nodes()
    tree = Tree()
    for i in all_nodes_list:
        tree.append_node(TreeNode(i))

    print(tree)

    for path, node in tree.nodes.items():
        print(path)
        print(node.element.layer.name)
        print(node.element.name)
        for up in node.upstream:
            print('    ' + up.element.path)
            print('    ' + up.element.layer.name)
            print('    ' + up.element.name)
        