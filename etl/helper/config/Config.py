import yaml

def read_configuration(file_path, env_name):

    with open(file_path + 'config_' + env_name + '.yml', 'r') as ymlfile:
        cfg = yaml.load(ymlfile, Loader=yaml.FullLoader)
        return cfg

def parse_configuration(base_path, env_name, section):
    cfg = read_configuration(base_path, env_name)
    if(section in cfg.keys()):
        return cfg[section]
    else:
        return {}

if __name__ == '__main__':
    print(read_configuration('/home/sam/works/cheetah_etl_helper/', 'qas'))
    print(parse_configuration('/home/sam/works/cheetah_etl_helper/', 'qas', 'mysql'))
    print(parse_configuration('/home/sam/works/cheetah_etl_helper/', 'qas', 'mysql1'))