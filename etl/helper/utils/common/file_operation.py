import string

def read_txt(file_path):
    with open(file_path, 'r') as f:
        ls_item = f.readlines()
        txt = ''.join(ls_item)
        return txt
