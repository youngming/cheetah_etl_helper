import threading
from etl.helper.utils.common import mysql_ops
from itertools import groupby
from operator import itemgetter


class MetaDataHelper(object):

    _instance_lock = threading.Lock()
    
    @staticmethod
    def get_instance():
        return MetaDataHelper()

    # Hidden the __init__ all init job run in __new__ method
    def __init__(self):
        pass

    def __new__(cls):

        if not hasattr(MetaDataHelper, "_instance"):
            with MetaDataHelper._instance_lock:
                if not hasattr(MetaDataHelper, "_instance"):
                    MetaDataHelper._instance = object.__new__(MetaDataHelper)
                    # MetaDataHelper._instance.__physical_info = dict()
                    # MetaDataHelper._instance.__partition_info = dict()
                    MetaDataHelper._instance.__fill()
                    
        return MetaDataHelper._instance

    # Notification: fill full information not only column name for extension used
    def __fill(self):
        sql_physical_columns = 'SELECT CONCAT(t2.NAME, \'.\', t1.TBL_NAME), t4.COLUMN_NAME, t4.TYPE_NAME, t4.INTEGER_IDX FROM TBLS t1 INNER JOIN DBS t2 ON t1.DB_ID = t2.DB_ID INNER JOIN SDS t3 ON t1.SD_ID = t3.SD_ID INNER JOIN COLUMNS_V2 t4 ON t3.CD_ID = t4.CD_ID order by t2.name, t1.TBL_NAME, t4.INTEGER_IDX'
        sql_partition_columns = 'SELECT CONCAT(t2.NAME, \'.\', t1.TBL_NAME), PKEY_NAME, PKEY_TYPE, t3.INTEGER_IDX FROM TBLS t1 INNER JOIN DBS t2 ON t1.DB_ID= t2.DB_ID JOIN hive.PARTITION_KEYS t3 ON t1.TBL_ID = t3.TBL_ID ORDER BY t2.NAME, t1.TBL_NAME, t3.INTEGER_IDX'
        physical_columns_result = mysql_ops.get_list(sql_physical_columns)
        partition_columns_result = mysql_ops.get_list(sql_partition_columns)
        physical_columns_groupby_result = groupby(physical_columns_result, key = itemgetter(0))
        self.__physical_info = {key:[item for item in data] for (key, data) in physical_columns_groupby_result}
        partition_columns_groupby_result = groupby(partition_columns_result, key = itemgetter(0))
        self.__partition_info = {key:[item for item in data] for (key, data) in partition_columns_groupby_result}

    # Get only column name info
    def physical_columns(self, table_name): 
        # 0:database.table_name 1:column_name 2:column_type 3:column_index
        if(table_name in self.__physical_info.keys()):
            return [item[1].upper() for item in self.__physical_info[table_name]]
        else:
            return []


    # Get only partition name info
    def partition_columns(self, table_name):
        # 0:database.table_name 1:column_name 2:column_type 3:column_index
        if(table_name in self.__physical_info.keys()):
            return [item[1].upper() for item in self.__partition_info[table_name] if table_name in self.__partition_info.keys()]
        else:
            return []

if __name__ == '__main__':

    metaDataHelper = MetaDataHelper.get_instance()
    metaDataHelper2 = MetaDataHelper()

    print(metaDataHelper == metaDataHelper2)
    print(metaDataHelper.physical_columns('stg.abc'))
    print(metaDataHelper.partition_columns('stg.cde'))
    print(metaDataHelper2.physical_columns('abc'))

    print(metaDataHelper.physical_columns('ads.fin_manual_adjust_di'))
    print(metaDataHelper.partition_columns('ads.fin_manual_adjust_di'))