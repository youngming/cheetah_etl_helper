# Cheetah ETL helper

## Overview:
1. Auto scan workflow with HQL script
2. Export the workflow to YAML file
3. Export the full workflow
4. Export the unused element
5. Check script output tablename should same with script name
6. Check reference count in same layer
7. Check group by items duplicated
8. Check select items distinct duplicated
9. Check insert index between script(HQL) and Hive Metadata
10. Support different source HQL output same target table (For example: layer.abc.hql and layer.xxx_abc.hql -> table layer.abc)
11. Click CLI support
12. Configuration support with different environment (config in file ./config_dev.yml ./config_prd.yml ./config_qas.yml)
13. Messager support alternative raise the exception when match an error
14. JDK 1.8.0 required
15. pyjnius==1.3.0 PyYAML==5.3.1 PyMySQL==0.10.0 click==7.1.2 required

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

        # checkout all the messages
        etl_scheduler.checkout_messager()

        # generate and export the yml file into etl home on local
        etl_scheduler.generate_output_files()
        ```
2. Run python run.py --help
```javascript
        Usage: run.py [OPTIONS]

        Options:
        -p, --etl_home_local TEXT   ETL home path in local  [required]
        -P, --etl_home_server TEXT  ETL home path in server  [required]
        -d, --depth_limit INTEGER   Reference limitation (Integer) within same layer
                                [required]

        -a, --alias_prefix TEXT     Alias prefix setting from multi source to same
                                target (comma split)

        -e, --env TEXT              Run environment value within PRD QAS DEV
                                [required]

        --help                      Show this message and exit.
```
3. python run.py --etl_home_local=/xxx --etl_home_server=/xxx --depth_limit=1 --alias_prefix=xxx,xxx --env=prd/dev/qas


## HQL Header:

1. -- depth_limit=[int] identify a special depth limit check in same layer
2. -- ignore_error_check=[true/false/1/0/t/f/y/n/yes/no] identify ignore the error message or not
3. -- ignore_warning_check=[true/false/1/0/t/f/y/n/yes/no] identify ignore the warning message or not

## Message checkout:

1. There is a file 'message.yml' saved in ETL project root folder to save all detail information about all messages description
2. There are summary information should be printed on console for common used

