import click
from etl.helper.module.Messager import Messager
from etl.helper.module.ETL_scheduler import ETLScheduler

@click.command()
@click.option('-p', '--etl_home_local', help='ETL home path in local', default='/var/lib/jenkins/workspace/prod_cheetah_etl', required=True)
@click.option('-P', '--etl_home_server', help='ETL home path in server', default='/opt/cheetah/cheetah_etl', required=True)
@click.option('-d', '--depth_limit', help='Reference limitation (Integer) within same layer', default='1', required=True, type=int)
@click.option('-a', '--alias_prefix', help='Alias prefix setting from multi source to same target (comma split)', default='mlp11,kfk', required=False)
@click.option('-e', '--env', help='Run environment value within PRD QAS DEV', default='PRD', required=True)
def run(etl_home_local, etl_home_server, depth_limit, alias_prefix, env):
    print('ETL home on local is {} | ETL home on server is {} | Depth limit is {} | Alias is {} | Environment is {}'.format(etl_home_local, etl_home_server, depth_limit, alias_prefix, env))
    Messager.get_instance().save_env(env)
    etl_scheduler = ETLScheduler(etl_home=etl_home_local ,depth_limit=depth_limit, server_etl_home=etl_home_server, alias_prefix=alias_prefix)
    etl_scheduler.scan_and_check()
    etl_scheduler.checkout_messager()
    etl_scheduler.generate_output_files()

if __name__ == "__main__":
    run()

