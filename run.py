import os
file_abs_path = os.path.dirname(os.path.abspath(__file__))
import sys
sys.path.append(file_abs_path)

from etl.helper.module.ETL_scheduler import ETLScheduler

if __name__ == '__main__':
    etl_home_local = sys.argv[1]
    etl_home_server = sys.argv[2]
    depth_limit = int(sys.argv[3])

    print('ETL home on local is {} | ETL home on server is {} | Depth limit is {}'.format(etl_home_local, etl_home_server, depth_limit))

    etl_scheduler = ETLScheduler(etl_home=etl_home_local ,depth_limit=depth_limit, server_etl_home=etl_home_server)
    etl_scheduler.scan_and_check()
    etl_scheduler.generate_output_files()