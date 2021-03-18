import jnius_config
import logging
#logging.getLogger().setLevel(logging.INFO)
import os
file_abs_path = os.path.dirname(os.path.abspath(__file__))
jnius_config.set_classpath(file_abs_path + '/grammar/sql-grammar.jar',file_abs_path + '/grammar/antlr-3.5.2-complete.jar')
import jnius
from enum import Enum
from functools import reduce
from itertools import groupby
from operator import itemgetter
from etl.helper.utils.sql import tokens
from etl.helper.module.Messager import Messager
StringStream = jnius.autoclass('org.antlr.runtime.ANTLRStringStream')
Lexer  = jnius.autoclass('grammar.HiveLexer')
Parser  = jnius.autoclass('grammar.HiveParser')
TokenStream  = jnius.autoclass("org.antlr.runtime.CommonTokenStream")

class TableType(Enum):
    INPUT = 1
    OUTPUT = 2

class TablePartition(object):
    def __init__(self, table_name, partition_columns):
        self.__table_name = table_name
        self.__partition_columns = partition_columns
    
    @property
    def table_name(self):
        return self.__table_name
    
    @property
    def partition_columns(self):
        return self.__partition_columns

    def __str__(self):
        return str('table name: {0} -> partition columns: {1}').format(self.table_name, self.partition_columns)

    def description(self):
        return {'table_name':self.table_name, 'partition_columns':self.partition_columns}

class FunctionElement(object):
    @property
    def function_name(self):
        return self.__function_name
    
    @property
    def alias_name(self):
        return self.__alias_name

    @property
    def arguments(self):
        return self.__arguments

    @property
    def expression_pattern(self):
        return self.expression()

    @property
    def source_column(self):

        for func_argument in list(filter(lambda argument: isinstance(argument, FunctionElement), self.arguments)):
            fun_argument_source_column = func_argument.source_column
            for fun_argument_source in fun_argument_source_column:
                self.__source_column.add(fun_argument_source)
        return self.__source_column

    def set_source_column(self, source_column):
        if(isinstance(source_column, set)):
            for i in source_column:
                self.__source_column.add(i)
        else:
            self.__source_column.add(source_column)

    # @function_name.setter
    def set_function_name(self, function_name):
        self.__function_name = function_name
   
    # @alias_name.setter
    def set_alias_name(self, alias_name):
        self.__alias_name = alias_name

    def append_argument(self, argument):
        if(isinstance(argument, list)):
            for i in argument:
                self.__arguments.append(i)
        else:
            self.__arguments.append(argument)

    
    def __init__(self) -> None:
        self.__arguments = list()
        self.__alias_name = ''
        self.__function_name = ''
        self.__source_column = set()

    def __str__(self) -> str:
        return str('function name: {0} | alias name: {1} | source_column: {2} | expression: {3} | argument: {4}').format(self.function_name, self.alias_name, self.source_column, self.expression(), [argument.__str__() for argument in self.arguments])
        # return str('function name: {0} | alias name: {1} | source_column: {2} | expression: {3}').format(self.function_name, self.alias_name, self.source_column, self.expression())

    def expression(self):
        result = self.function_name + '('
        isFirst = True
        if(self.function_name != 'CAST'):
            for argument in self.arguments:
                if(not isFirst):
                    result += ','
                isFirst = False
                if(isinstance(argument, FunctionElement)):
                    result += argument.expression()
                else:
                    result += argument
        elif(self.function_name == 'CAST' and len(self.arguments) == 2):
            key = self.arguments[1]
            type = self.arguments[0].replace('TOK_', '')
            if(isinstance(key, FunctionElement)):
                result += key.expression()
            else:
                result += key
            result += ' AS ' + type
        
        result += ')'
        
        if(self.alias_name != ''):
            result += " AS " + self.alias_name
        
        return result

    def description(self):
        return {'function_name':self.function_name, 'source_columns':list(self.source_column), 'alias_name':self.alias_name, 'expression':self.expression()}
            

# class ItemDuplicatedException(Exception):
#     pass

def __walktree(node,depth = 0):
    print("%s%s=%s" % (str(depth) + "  "*depth,node.getText(),node.getType()))
    children = node.children
    if not children:
        return
    ch_size = children.size()
    for i in range(ch_size):
        ch =children.get(i)
        __walktree(ch,depth + 1)       

def __search_node_with_specific_type(node_inputed, specific_type):
    if(node_inputed.getType() == specific_type):
        yield node_inputed
    elif(node_inputed.children != None):
        for node_child in node_inputed.children:
            yield from __search_node_with_specific_type(node_child, specific_type)

def __search_node_with_specific_type_with_depth(node_inputed, specific_type, depth = 0):
    depthinner = depth
    if(node_inputed.getType() == specific_type):
        yield (node_inputed, depthinner)
        depth = 0
    elif(node_inputed.children != None):
        depthinner += 1
        for node_child in node_inputed.children:
            yield from __search_node_with_specific_type_with_depth(node_child, specific_type, depthinner)

def __search_node_with_specific_type_only_in_child(node_inputed, specific_type):
    if(node_inputed.children != None):
        return list(filter(lambda child_node: child_node.getType() == specific_type, node_inputed.children))

def __search_node_without_specific_type_only_in_child(node_inputed, specific_type):
    if(node_inputed.children != None):
        return list(filter(lambda child_node: child_node.getType() != specific_type, node_inputed.children))

def __node_with_specific_type_existed(node_inputed, specific_type):
    isExisted = len(list(__search_node_with_specific_type(node_inputed, specific_type))) > 0
    return isExisted

def __node_with_specific_type_existed_only_in_child(node_inputed, specific_type):
    specific_node_in_children = __search_node_with_specific_type_only_in_child(node_inputed, specific_type)
    isExisted = specific_node_in_children != None and len(specific_node_in_children) > 0
    return isExisted

def __append_arguments_not_function(node_inputed, function_element_inputed):
    if(node_inputed.children == None):
        function_element_inputed.append_argument(node_inputed.getText())
    elif(node_inputed.getType() != tokens.TOK_TABLE_OR_COL):
        if(node_inputed.getType() == tokens.TOK_DECIMAL):
            function_element_inputed.append_argument('DECIMAL(' + ','.join([node.getText() for node in node_inputed.children]) + ')')
            function_element_inputed.set_source_column(set([table_node.children[0].getText() for table_node in filter(lambda node_child: node_child.getType() == tokens.TOK_TABLE_OR_COL, node_inputed.children)]))
        elif(__node_with_specific_type_existed(node_inputed, tokens.TOK_TABLE_OR_COL) and node_inputed.getText() != '.' and node_inputed.children[0].getText() == '.'):
            function_element_inputed.append_argument(node_inputed.getText().join([argument.getText() if not __node_with_specific_type_existed(argument, tokens.TOK_TABLE_OR_COL) else list(__search_node_with_specific_type(argument, tokens.TOK_TABLE_OR_COL))[0].children[0].getText() + '.' + argument.children[1].getText() for argument in node_inputed.children]))
            function_element_inputed.set_source_column(set([table_node.children[0].getText() for table_node in filter(lambda node_child: node_child.getType() == tokens.TOK_TABLE_OR_COL, node_inputed.children)]))
        else:
            function_element_inputed.append_argument(node_inputed.getText().join([argument.getText() if argument.getType() != tokens.TOK_TABLE_OR_COL else argument.children[0].getText() for argument in node_inputed.children]))
            function_element_inputed.set_source_column(set([table_node.children[0].getText() for table_node in filter(lambda node_child: node_child.getType() == tokens.TOK_TABLE_OR_COL, node_inputed.children)]))
    else:
        source_column = __search_node_with_specific_type_only_in_child(node_inputed, tokens.IDENTIFY)[0].getText()
        function_element_inputed.set_source_column(source_column)
        function_element_inputed.append_argument(source_column)

def __generator_function(node_func_parent, index = 0, parent_function_name = None):
    function = FunctionElement()
    if(__node_with_specific_type_existed_only_in_child(node_func_parent, tokens.IDENTIFY)):
        alias_node = __search_node_with_specific_type_only_in_child(node_func_parent, tokens.IDENTIFY)[0]
        if(parent_function_name == None or parent_function_name != alias_node.getText()):
            function.set_alias_name(alias_node.getText())
    function_node = __search_node_with_specific_type_only_in_child(node_func_parent, tokens.TOK_FUNCTION)[index]
    if(__node_with_specific_type_existed_only_in_child(function_node, tokens.IDENTIFY)):
        function_name = __search_node_with_specific_type_only_in_child(function_node, tokens.IDENTIFY)[0].getText()
    else:
        function_name = 'CAST'
    function.set_function_name(function_name)
    
    argument_node_list = __search_node_without_specific_type_only_in_child(function_node, tokens.IDENTIFY)
    index_tmp = 0
    for argument_node in argument_node_list:
        if(argument_node.getType() == tokens.TOK_FUNCTION):
            function.append_argument(__generator_function(function_node, index = index_tmp, parent_function_name = function.function_name))
            index_tmp += 1
        else:
            __append_arguments_not_function(argument_node, function)

    return function

def __find_all_items_select_index(node_inputed, **kwargs):
    output_name = kwargs['output_name']
    result = []

    if(__node_with_specific_type_existed(node_inputed, tokens.TOK_ALLCOLREF)):
        #Insert from a union all segement
        all_insert_with_depth = list(__search_node_with_specific_type_with_depth(node_inputed, tokens.TOK_INSERT))
        depth_key_insert_list = {key:list(insert_node_tuple) for (key, insert_node_tuple) in groupby(sorted(all_insert_with_depth, key = lambda insert_tuple: insert_tuple[1]), key = lambda insert_tuple: insert_tuple[1])}
        all_insert = list()
        if(len(depth_key_insert_list) > 1):
            min_key = sorted(depth_key_insert_list.keys())[1]
            all_insert.extend([insert_node[0] for insert_node in depth_key_insert_list[min_key]])

        for insert_node in all_insert:
            result_once = []
            select_exp_list = __search_node_with_specific_type(insert_node, tokens.TOK_SELEXPR)
            for select_exp in select_exp_list:
                if(__node_with_specific_type_existed_only_in_child(select_exp, tokens.IDENTIFY)):
                    result_once.extend(list(map(lambda identify_node : identify_node.getText(), __search_node_with_specific_type_only_in_child(select_exp, tokens.IDENTIFY))))
                elif(__node_with_specific_type_existed_only_in_child(select_exp, tokens.DOT)):
                    result_once.extend(list(map(lambda identify_node: identify_node.getText(), __search_node_with_specific_type_only_in_child(__search_node_with_specific_type_only_in_child(select_exp, tokens.DOT)[0], tokens.IDENTIFY))))
                else:
                    result_once.extend(list(map(lambda identify_node: identify_node.getText(), __search_node_with_specific_type(select_exp, tokens.IDENTIFY))))
            if(__node_with_specific_type_existed(insert_node, tokens.TOK_PARTVAL)):
                partition_val_nodes = list(__search_node_with_specific_type(insert_node, tokens.TOK_PARTVAL))
                # Append the columns with partition column if there is partition (key = 'value')
                # Append nothing if partititon only and without partition
                partition_val_nodes = filter(lambda partition_val_node: __node_with_specific_type_existed_only_in_child(partition_val_node, tokens.VALUE), partition_val_nodes)
                partition_val_identify_nodes = [__search_node_with_specific_type(partition_val_node, tokens.IDENTIFY) for partition_val_node in partition_val_nodes]
                partition_val_identify_node_list = list()
                for partition_val_identify_node in partition_val_identify_nodes:
                    partition_val_identify_node_list.extend(list(partition_val_identify_node))
                partition_columns = list([partition_val_identify.getText() for partition_val_identify in partition_val_identify_node_list])
                # Append into above insert columns if UNION segement exists. But do not append insert columns in final insert segement
                for partition_column in partition_columns:
                    for result_item in result:
                        if(partition_column not in result_item):
                            result_item.append(partition_column)
            if(len(result_once) > 0):
                result.append(result_once)
    else:
        #Common insert from
        all_insert = __search_node_with_specific_type(node_inputed, tokens.TOK_INSERT)
        for insert_node in all_insert:
            table_name_nodes = list(__search_node_with_specific_type(insert_node, tokens.TOK_TABNAME))
            table_name = ''
            result_once = []
            if(len(table_name_nodes) == 1):
                table_name_text_nodes = table_name_nodes[0].children
                if(len(table_name_text_nodes) == 1):
                    table_name = table_name_text_nodes[0].getText()
                else:
                    table_name = reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), table_name_text_nodes)
                
                if(table_name == output_name):
                    select_exp_list = __search_node_with_specific_type(insert_node, tokens.TOK_SELEXPR)
                    for select_exp in select_exp_list:
                        if(__node_with_specific_type_existed_only_in_child(select_exp, tokens.IDENTIFY)):
                            result_once.extend(list(map(lambda identify_node : identify_node.getText(), __search_node_with_specific_type_only_in_child(select_exp, tokens.IDENTIFY))))
                        elif(__node_with_specific_type_existed_only_in_child(select_exp, tokens.DOT)):
                            result_once.extend(list(map(lambda identify_node: identify_node.getText(), __search_node_with_specific_type_only_in_child(__search_node_with_specific_type_only_in_child(select_exp, tokens.DOT)[0], tokens.IDENTIFY))))
                        else:
                            result_once.extend(list(map(lambda identify_node: identify_node.getText(), __search_node_with_specific_type(select_exp, tokens.IDENTIFY))))
                    
                    if(__node_with_specific_type_existed(insert_node, tokens.TOK_PARTVAL)):
                        partition_val_nodes = list(__search_node_with_specific_type(insert_node, tokens.TOK_PARTVAL))
                        partition_val_nodes = filter(lambda partition_val_node: __node_with_specific_type_existed_only_in_child(partition_val_node, tokens.VALUE), partition_val_nodes)
                        partition_val_identify_nodes = [__search_node_with_specific_type(partition_val_node, tokens.IDENTIFY) for partition_val_node in partition_val_nodes]
                        partition_val_identify_node_list = list()
                        for partition_val_identify_node in partition_val_identify_nodes:
                            partition_val_identify_node_list.extend(list(partition_val_identify_node))
                        partition_columns = list([partition_val_identify.getText() for partition_val_identify in partition_val_identify_node_list])
                        for partition_column in partition_columns:
                            if(partition_column not in result_once):
                                result_once.append(partition_column)
                    
                    result.append(result_once)

    
    return result

def __find_all_items_select(node_inputed):
    node_select = list(__search_node_with_specific_type(node_inputed, tokens.TOK_SELECT))
    if(len(list(node_select)) == 1):
        return list(map(lambda item_node: item_node.getText().upper(), __search_node_with_specific_type(list(node_select)[0], tokens.IDENTIFY)))

def __find_specific_elements(node_inputed):
    if(node_inputed.getType() == tokens.TOK_INSERT and __node_with_specific_type_existed(node_inputed, tokens.TOK_PARTSPEC)):
        table_name_nodes = list(__search_node_with_specific_type(node_inputed, tokens.TOK_TABNAME))
        table_name_val_node = list(__search_node_with_specific_type(table_name_nodes[0], tokens.IDENTIFY))
        # table name
        table_name = reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), table_name_val_node)
        # print('table name : %s' %table_name)
        
        partition_val_nodes = list(__search_node_with_specific_type(node_inputed, tokens.TOK_PARTVAL))
        # partition columns link with table insert
        partition_columns = [partition_val_node.children[0].getText() for partition_val_node in partition_val_nodes]
        # print('partition columns : %s' %partition_columns)

        table_partition = TablePartition(table_name, partition_columns)
        # print(table_partition)
        yield table_partition

    elif(node_inputed.getType() == tokens.TOK_SELEXPR and __node_with_specific_type_existed_only_in_child(node_inputed, tokens.TOK_FUNCTION)):
        function = __generator_function(node_inputed)
        # print('function : %s' %function)
        yield function
        
    else:
        if(node_inputed.children != None):
            for node_child in node_inputed.children:
                yield from __find_specific_elements(node_child) 

def __find_table_name(node_inputed, type_inputed = None, temporary_inputed = False, **kwargs):
    output_name = kwargs['output_name']
    sql_input = kwargs['sql']
    path = kwargs['path']
    element = kwargs['element']

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
        __check_groupby_duplication(node_inputed, sql_input, path, element)
    # Check select distince duplicated
    if(node_inputed.getType() == tokens.TOK_SELECTDI): 
        __check_selectdi_duplication(node_inputed, sql_input, path, element)

    if(node_inputed.getType() == tokens.TOK_TABNAME):
        table_name = ''
        table_name_nodes = node_inputed.children
        if(len(table_name_nodes) == 1):
            table_name = table_name_nodes[0].getText()
        else:
            table_name = reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), table_name_nodes)

        if(type == TableType.OUTPUT and table_name == output_name):
            yield ('output_sql', sql_input)
        yield (type, table_name, is_temporary)
        
    else:
        child_nodes = node_inputed.children
        if(child_nodes != None):
            for child_node in child_nodes:
                yield from __find_table_name(child_node, type, is_temporary, **kwargs)

def __check_groupby_duplication(node_inputed, sql_input, path, element):
    groupby_children_items = list(filter(lambda node: node.getType() != tokens.TOK_FUNCTION, node_inputed.children))
    group_input_size = len(groupby_children_items)
    group_item_s = set()
    for groupby_child in groupby_children_items: 
        if(groupby_child.getType() == tokens.TOK_TABLE_OR_COL):
            # Column name directly without alias name before
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
        duplication_msg = 'SQL: {0} in path: {1} duplicate inputed in {2}. There are {3} but {4} actually. They are {5}'.format(sql_input, path, node_inputed.getText(), group_input_size, len(group_item_s), group_item_s)
        # raise ItemDuplicatedException(duplication_msg)
        Messager.get_instance().raise_item_duplicated(duplication_msg, addition_info = '', raiser = element)
        

def __check_selectdi_duplication(node_inputed, sql_input, path, element): 
    select_distinct_node_items = list(filter(lambda node: node.getFirstChildWithType(tokens.TOK_FUNCTION) == None , node_inputed.children))
    select_distinct_input_size = len(select_distinct_node_items)
    select_distinct_s = set()
    for select_distinct_node in select_distinct_node_items: 
        if(select_distinct_node.getFirstChildWithType(tokens.TOK_TABLE_OR_COL)):
            # select column directly without alias
            column_item = select_distinct_node.getFirstChildWithType(tokens.TOK_TABLE_OR_COL)
            if(column_item.getChildCount() == 1):
                select_distinct_s.add(column_item.getChild(0).getText())
            else:
                select_distinct_s.add(reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), 
                list(filter(lambda node: node.getType() == tokens.TOK_TABLE_OR_COL, select_distinct_node.children))))
        else: 
            tmp_select_distinct_column = ''
            for alias_select_distinct_child in select_distinct_node.children: 
                if(alias_select_distinct_child.getType() == tokens.DOT): 
                    for alias_select_distinct_tab_col in alias_select_distinct_child.children: 
                        if(alias_select_distinct_tab_col.getType() == tokens.TOK_TABLE_OR_COL): 
                            if(len(alias_select_distinct_tab_col.children) == 1):
                                tmp_select_distinct_column += alias_select_distinct_tab_col.children[0].getText() + '.'
                            else:
                                tmp_select_distinct_column += reduce(lambda t1, t2: t1.getText() + '.' + t2.getText(), alias_select_distinct_tab_col.children) + '.'
                        else:
                            tmp_select_distinct_column += alias_select_distinct_tab_col.getText()
            
            select_distinct_s.add(tmp_select_distinct_column)

    if(select_distinct_input_size != len(select_distinct_s)): 
        duplication_msg = 'SQL: {0} in path: {1} duplicate inputed in {2}. There are {3} but {4} actually. They are {5}'.format(sql_input, path, node_inputed.getText(), select_distinct_input_size, len(select_distinct_s), select_distinct_s)
        # raise ItemDuplicatedException(duplication_msg)
        Messager.get_instance().raise_item_duplicated(duplication_msg, addition_info = '', raiser = element)

#Use on regular helper check. Input/Output list check and selectdistinct and groupby duplicate check
def analysis(single_sql_sentence, **kwargs):
    kwargs.update({'sql': single_sql_sentence})
    return __analysis_function(single_sql_sentence, __find_table_name, show_tree = False, **kwargs)

def output_index(single_sql_sentence, **kwargs):
    return __analysis_function(single_sql_sentence, __find_all_items_select_index, show_tree = False, **kwargs)

#Use on ods function and partition scan only use once
def scan_specific(single_sql_sentence):
    return __analysis_function(single_sql_sentence, __find_specific_elements, show_tree = False)

#Use on stg select item order and content check between stg ops and table init script use once
def items_select(single_sql_sentence):
    return __analysis_function(single_sql_sentence, __find_all_items_select, show_tree = False)

def __analysis_function(single_sql_sentence, analysis_function, show_tree = False, **kwargs):
    try:
        logging.info(single_sql_sentence)
        sql_string = single_sql_sentence.upper()
        sqlstream = StringStream(sql_string)
        inst = Lexer(sqlstream)
        ts = TokenStream(inst)
        parser = Parser(ts)
        ret  = parser.statement()
        treeroot = ret.getTree()
        if(show_tree):
            __walktree(treeroot)
        return [analysis_result for analysis_result in analysis_function(treeroot, **kwargs)]
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
    # sql_string = "insert overwrite table dwd.dim_item_df SELECT hm.MD_CODE as pk_item_code, hma5.C_10044 as item_barcode, '' as item_category, hma5.C_10050 as item_subcategory, hma5.C_10051 as item_sub_category, hma5.C_10039 as item_type, '' as gross_weight, hma5.C_10054 as net_weight, hma5.C_10055 as weight_unit, hma5.C_10085 as item_length, hma5.C_10086 as item_width, hma5.C_10087 as item_height, MAX(hma5.C_10088) as size_unit, hma5.C_10089 as item_volume, MAX(hma5.C_10090) as item_volume_unit, '' as guarantee_period, hma5.C_10047 as item_name_zh, hma5.C_10048 as item_name_en, he.NAME as buying_manager, bmdm.buying_director as buying_director, '' as item_category_name, scvb1.DESCRIPTION as item_sub_category_name, scvb2.DESCRIPTION as item_sub_subcategory_name, hma5.C_10053 as product_status, hma5.C_10079 as per_box_amount, hma5.C_10097 as per_box_amount_product, hma5.C_10080 as per_layer_boxes, hma5.C_10081 as per_torr_layers, hma5.C_10082 as per_torr_boxes, hma5.C_10083 as box_weight, MAX(hma5.C_10084) as box_heavy_unit, hma5.C_10085 as box_length, hma5.C_10086 as box_width, hma5.C_10087 as box_height, MAX(hma5.C_10088) as measuring_unit, hma5.C_10089 as total_volume, MAX(hma5.C_10090) as volume_unit, hma5.C_10216 as tax_rate, hma5.C_10217 as estimated_cost, scvb3.DESCRIPTION as order_type, scvb4.DESCRIPTION as logistic_code, bc.ZB_P_L as brand_type, pam.product_source as product_source, scvb5.DESCRIPTION as product_status_name, scvb6.DESCRIPTION as storage_temp, from_unixtime(unix_timestamp(),'yyyy-MM-dd HH:mm:ss') as etl_date FROM ods.mdm_hap_prd_hmdm_md hm JOIN ods.mdm_hap_prd_hmdm_md_attr_10005 hma5 ON hm.ID=hma5.MD_ID LEFT JOIN ods.mdm_hap_prd_hr_employee he ON hma5.C_10261=he.EMPLOYEE_ID LEFT JOIN ods.impt_cheetah_impt_buying_m_d_mapping bmdm ON he.name=bmdm.buying_manager LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb1 ON hma5.C_10050=scvb1.VALUE AND scvb1.CODE_ID = '10150' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb2 on hma5.C_10051=scvb2.VALUE AND scvb2.CODE_ID = '10151' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb3 ON hma5.C_10218=scvb3.VALUE AND scvb3.CODE_ID = '10180' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb4 ON hma5.C_10227=scvb4.VALUE AND scvb4.CODE_ID = '10182' LEFT JOIN ods.mdm_hap_prd_brand_config bc on hma5.C_10093=bc.ZB_CODE LEFT JOIN ods.impt_cheetah_impt_product_attribute_m pam ON hm.MD_CODE=pam.product_code LEFT join ods.mdm_hap_prd_sys_code_value_b scvb5 ON hma5.C_10053=scvb5.VALUE AND scvb5.CODE_ID = '10102' LEFT JOIN ods.mdm_hap_prd_sys_code_value_b scvb6 ON hma5.C_10068=scvb6.VALUE AND scvb6.CODE_ID = '10103' WHERE hm.MD_TOP_CATE_ID='10002' GROUP BY hm.MD_CODE, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10047, hma5.C_10048, he.NAME, bmdm.buying_director, scvb1.DESCRIPTION, scvb2.DESCRIPTION, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10080, hma5.C_10081, cast(dmc.pk_merchant_id as bigint), cast(dmc.pk_merchant_id as bigint), cast(dmc.pk_merchant_id as bigint), cast(hma5.C_10085 as bigint), cast(C_10085 as bigint), hma5.C_10083, C_10085, C_10086, C_10087, C_10089, hma5.C_10216, hma5.C_10217, scvb3.DESCRIPTION, scvb4.DESCRIPTION, bc.ZB_P_L, pam.product_source, scvb5.DESCRIPTION, scvb6.DESCRIPTION"    
    
    # sql_string = "SELECT distinct hma5.MD_ID, hma5.C_10044, hma5.C_10050, hma5.C_10051, hma5.C_10039, hma5.C_10054, hma5.C_10055, hma5.C_10085, hma5.C_10086, hma5.C_10087, hma5.C_10089, hma5.C_10047, hma5.C_10048, hma5.C_10053, hma5.C_10079, hma5.C_10097, hma5.C_10097, hma5.C_10059 FROM ods.mdm_hap_prd_hmdm_md_attr_10005 hma5"
    # sql_string = "SELECT distinct MD_ID, C_10044, C_10050, C_10051, C_10039, C_10054, C_10055, C_10085, C_10086, C_10087, C_10089, C_10047, C_10048, C_10053, C_10079, C_10097, C_10097, C_10059 FROM ods.mdm_hap_prd_hmdm_md_attr_10005 hma5"
    # sql_string = "SELECT distinct cast(MD_ID as bigint), cast(hma5.MD_ID as bigint), hma5.C_10044, hma5.C_10050, aaa.C_10051, C_10039, C_10054, C_10055, C_10085, C_10086, C_10087, C_10089, C_10047, C_10048, C_10053, C_10079, C_10097, C_10097, C_10059 FROM ods.mdm_hap_prd_hmdm_md_attr_10005 hma5"
    sql_string = "SELECT distinct cast(MD_ID as bigint), cast(hma5.MD_ID as bigint), hma5.C_10044, hma5.C_10050, aaa.C_10051, C_10039, C_10054, C_10055, C_10085, C_10086, C_10087, C_10089, C_10047, C_10048, C_10053, C_10079, C_10097, C_10059 FROM ods.mdm_hap_prd_hmdm_md_attr_10005 hma5"
    result = analysis(sql_string)
    print(result)

    
