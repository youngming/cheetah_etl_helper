pip install apache-airflow   
pip install 'apache-airflow[mysql]'   
pip install 'apache-airflow[jdbc]'   

### Start mysql
docker start ce1   

--start airflow
airflow webserver   
airflow scheduler   

### HDFS
/home/crh/app/hadoop-2.6.2/sbin/start-dfs.sh   

### Yarn
/home/crh/app/hadoop-2.6.2/sbin/start-yarn.sh   

### zookeeper
/home/crh/app/zookeeper361/apache-zookeeper-3.6.1-bin/bin/zkServer.sh start-foreground

### Hive
hiveserver2   

### Spark
/home/crh/app/spark-2.3.3-bin-hadoop2.6/sbin/start-thriftserver.sh   

### RabbitMQ
docker start rabbitmq3.8.5
---------------------------------------------------------------------------------------
MLP 测试环境
Host：10.224.18.201: 3306
aldiread
EYj3dd!Tl550AMS188uw&L


airflow backfill daily_increment -l -s 2020-08-06 -e 2020-08-09

airflow backfill daily_increment -s 2020-08-01 -e 2020-08-10 --donot_pickle

airflow backfill daily_increment -s 2020-08-11 -e 2020-08-20 --donot_pickle


airflow backfill example_subdag_operator -l -s 2020-08-06 -e 2020-08-07
airflow backfill example_subdag_operator -l -s 2020-08-07 -e 2020-08-08

airflow run example_subdag_operator section-1 2020-08-19
airflow run example_subdag_operator start 2020-08-19

airflow backfill daily_increment -s 2020-08-01 -e 2020-08-02 --donot_pickle