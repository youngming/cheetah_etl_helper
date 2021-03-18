import pymysql
import logging
import os
from etl.helper.module.Messager import Messager, MessageLevel, MessageSummary
from etl.helper.config.Config import parse_configuration

logger = logging.getLogger(__name__)

class EnvironmentUnknowException(Exception):
    pass

def get_conn(timeout=None):
    env = list(filter(lambda message: message.summary == MessageSummary.Environment, Messager.get_instance().level_messages(MessageLevel.INFO)))

    if(len(env) != 1):
        raise EnvironmentUnknowException()
    file_abs_path = os.path.dirname(os.path.abspath(__file__)).replace('etl/helper/utils/common', '')
    configuration = parse_configuration(file_abs_path, env[0].message.lower(), 'mysql')
    return pymysql.connect(
        host=configuration['host'],
        port=int(configuration['port']),
        user=configuration['user'],              
        password=configuration['password'],
        database=configuration['database'],
        read_timeout=timeout,
        charset='utf8mb4'
        # cursorclass=pymysql.cursors.DictCursor
    )


def get_list(sql_text):
    logger.info(sql_text)
    res = None
    try:
        conn = get_conn()
        with conn.cursor() as cursor:
            cursor.execute(sql_text)
            res = cursor.fetchall()
    except Exception as e:
        raise e
    finally:
        conn.close()
    return res


def get_one(sql_text):
    logger.info(sql_text)
    res = None
    try:
        conn = get_conn()
        with conn.cursor() as cursor:
            cursor.execute(sql_text)
            res = cursor.fetchone()
    finally:
        conn.close()
    return res


# insert or update one
def execute_one(sql_text):
    res = None
    try:
        conn = get_conn()
        with conn.cursor() as cursor:
            cursor.execute(sql_text)
            res = cursor.lastrowid
            conn.commit()
    finally:
        conn.close()
    return res