from etl.helper.utils.common.file_operation import search_files_in_folder
from etl.helper.module.ETL_element import FileElement, SQLElement
import os



def get_all_node():
    etl_home = os.getenv("ETL_HOME")
    stg_file_list = search_files_in_folder(etl_home + '/src/stg', 'ops', 'sql')
    odh_file_list = search_files_in_folder(etl_home + '/src/odh', 'ops', 'hql')
    ods_file_list = search_files_in_folder(etl_home + '/src/ods', 'ops', 'hql')
    dwd_file_list = search_files_in_folder(etl_home + '/src/dwd', 'ops', 'hql')
    dws_file_list = search_files_in_folder(etl_home + '/src/dws', 'ops', 'hql')
    dm_file_list = search_files_in_folder(etl_home + '/src/dm', 'ops', 'hql')
    ads_file_list = search_files_in_folder(etl_home + '/src/ads', 'ops', 'hql')

    # print([x for x in next(stg_file_list)])
    # print([x for x in odh_file_list])
    # print([x for x in ods_file_list])
    # print([x for x in dwd_file_list])
    # print([x for x in dws_file_list])
    # print([x for x in dm_file_list])
    # print([x for x in ads_file_list])

    etl_element_list = []

    # print([stg_file for stg_file in next(stg_file_list)])
    # for stg in next(stg_file_list):
    #     print(stg)
    # print(etl_element_list)
    # for etl in etl_element_list:
    #     print(etl)



    stg = [FileElement(etl_ele) for etl_ele in next(stg_file_list)]
    odh = [SQLElement(etl_ele) for etl_ele in next(odh_file_list)]
    ods = [SQLElement(etl_ele) for etl_ele in next(ods_file_list)]
    dwd = [SQLElement(etl_ele) for etl_ele in next(dwd_file_list)]
    dws = [SQLElement(etl_ele) for etl_ele in next(dws_file_list)]

    for i in stg:
        print(i)
    for i in odh:
        print(i)
    for i in ods:
        print(i)
    for i in dwd:
        print(i)
    for i in dws:
        print(i)

if __name__ == '__main__':
    get_all_node()