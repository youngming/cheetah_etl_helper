# Cheetah ETL helper

## Overview:
1. Auto scan workflow with HQL script
2. Export the workflow to YAML file
3. Export the full workflow
4. Export the unused element
5. Scan ETL project with rules(generated tablename check/same layer reference count check/group by duplicated/select distinct duplicated/)
6. JDK 1.8.0 required
7. pyjnius==1.3.0 and PyYAML==5.3.1 required

## How to use:
1. Write python script to create and use ETLScheduler instance
   - Set "ETL_HOME" in environment parameter ***(Optional can use 'etl_home' when startup in ETLScheduler)***
   - Set "DEPTH_LIMIT" in environment parameter ***(Optional can use 'depth_limit' when startup in ETLScheduler)***
   - ```javascript 
        # create a ETLScheduler instance 
        # etl_home is the etl home on local
        # server_etl_home is the etl home on server
        # depth_limit is depth limitation in same layer (-1 is unused)
        # alias_prefix is used in scenery with multiple upstream source ETL to a same target table. The ETL file name should be different with the table name generatered. alias_prefix can be set multiple with ',' splited (example here: dwd.mlp11_abc should generatered table dwd.abc but not dwd.mlp11_abc table)
        etl_scheduler = ETLScheduler(etl_home='/home/sam/cheetah_etl', server_etl_home='/home/sam.works/cheetah_etl', depth_limit=1, alias_prefix=mlp11)
        
        # begin to scan and check with rules
        etl_scheduler.scan_and_check()

        # generate and export the yml file into etl home on local
        etl_scheduler.generate_output_files() ```
2. Run 'root_folder/run.py [etl_home] [server_etl_home] [depth_limit]' directly (All parameter is same with ETLScheduler constructor)
