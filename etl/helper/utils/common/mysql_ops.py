import pymysql
import logging
logger = logging.getLogger(__name__)


def get_conn(timeout=None):
    return pymysql.connect(
        host='10.224.24.164',
        port=3306,
        user='hive',              
        password='hive@A123',
        database='hive',
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