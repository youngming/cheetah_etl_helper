from etl.helper.utils.common.file_operation import search_files_in_folder, delete_files_in_folders, delete_file
from etl.helper.module.ETL_element import FileElement, SQLElement, Layer
from etl.helper.module.Tree import TreeNode, Tree
import os
from functools import reduce
import logging
import yaml

#Throw this exception when without ETL_HOME argument inputed
class ArgumentMissingException(Exception):
    pass

#Throw this exception when same layer reference exceeded the limit
class LayerReferenceDepthLimitationException(Exception):
    pass

class ETLScheduler(object):

    def __init__(self, etl_home=None, depth_limit=None, server_etl_home=None, alias_prefix=None):
        self.__etl_home = etl_home
        self.__depth_limit = depth_limit
        self.tree = None

        if(self.__etl_home == None):
            self.__etl_home = os.getenv('ETL_HOME')
        
        if(self.__etl_home == None):
            raise ArgumentMissingException('Can not get argument ETL_HOME neither in ETLScheduler constructor input or in os environment.')

        if(self.__depth_limit == None and os.getenv('DEPTH_LIMIT') != None):
            self.__depth_limit = int(os.getenv('DEPTH_LIMIT'))
        
        if(server_etl_home == None):
            self.__server_etl_home = self.__etl_home
        else:
            self.__server_etl_home = server_etl_home

        if(alias_prefix == None):
            self.__alias_prefix = []
        else:
            self.__alias_prefix = alias_prefix.split(',')

    def __get_nodes(self):
        stg_file_gen = list(search_files_in_folder(self.__etl_home + '/src/stg', 'ops', 'sql'))
        others_gen = list(search_files_in_folder(self.__etl_home + '/src', 'ops', 'hql'))
        all_sql_element = []
        for stg_file_list in stg_file_gen:
            for stg_file in stg_file_list:
                all_sql_element.append(FileElement(stg_file, self.__etl_home, self.__server_etl_home))
        for others_file_list in others_gen:
            for others_file in others_file_list:
                all_sql_element.append(SQLElement(others_file, self.__etl_home, self.__server_etl_home, self.__alias_prefix))
        
        tree = Tree(depth_limit_same_layer=self.__depth_limit)
        for node in all_sql_element:
            tree.append_node(TreeNode(node))
        
        self.tree = tree
        return tree

    #Generate output with only required info and save them split files into different folder
    def __generate_output_with_part_info(self, tree, delete_before_generate=True):
        if(delete_before_generate):
            delete_files_in_folders(self.__etl_home, 'yml', Layer.STG.name.lower())
            
        for path, node in tree.nodes.items():
            if(len(node.upstream) > 0):
                file_path = '/'.join(path.split('/')[0:-2]) + '/yml'
                file_name = node.element.name + '.yml'
                yaml_file = file_path + '/' + file_name
                file_content = [up.element.reference_name.lower() for up in node.upstream]
                with open(yaml_file , 'w+') as yaml_writer:
                    yaml.dump(file_content, yaml_writer)

    #Generate output with all of the info and save them into one file
    def __generate_output_with_full_info(self, tree, delete_before_generate=True):
        file_path = self.__etl_home + '/full_info.yml'
        if(delete_before_generate):
            delete_file(file_path)

        output = []
        for path, node in tree.nodes.items():
            output.append(node.description())

        with open(file_path , 'w+') as yaml_writer:
            yaml.dump(output, yaml_writer)

    def __generate_output_without_reference(self, tree, delete_before_generate=True):
        file_path = self.__etl_home + '/unused.yml'
        if(delete_before_generate):
            delete_file(file_path)

        output = [
            node.element.show_name for node in 
            filter(lambda node : node.element.layer.value < Layer.DWD.value and len(node.downstream) == 0,self.tree.nodes.values())]

        with open(file_path , 'w+') as yaml_writer:
            yaml.dump(output, yaml_writer)


    def generate_output_files(self):
        if(self.tree == None):
            self.tree = self.__get_nodes()
        
        self.__generate_output_with_part_info(self.tree)
        self.__generate_output_with_full_info(self.tree)
        self.__generate_output_without_reference(self.tree)

    def scan_and_check(self):
        if(self.tree == None):
            self.tree = self.__get_nodes()
        
        depth_exception_info = self.tree.check_depth()
        if(depth_exception_info != None and len(depth_exception_info) > 0):
            logging.error('These reference are limitation exceeded {}'.format(depth_exception_info))
            raise LayerReferenceDepthLimitationException(depth_exception_info)



if __name__ == '__main__':
    
    etl_scheduler = ETLScheduler(etl_home='/home/sam/cheetah_etl' ,depth_limit=1, server_etl_home='/home/sam/works/cheetah_etl', alias_prefix='mlp11')
    etl_scheduler.scan_and_check()
    tree = Tree()
    # for path, node in tree.nodes.items():
    #     print(node.element.show_name)
    #     print('--' + ','.join([n.element.show_name for n in node.upstream]))
    #     print('--' + ','.join([n.element.show_name for n in node.downstream]))

    etl_scheduler.generate_output_files()
        