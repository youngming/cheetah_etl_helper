import string
import os
import shutil

def read_txt(file_path):
    with open(file_path, 'r') as f:
        ls_item = f.readlines()
        txt = ''.join(ls_item)
        return txt

def search_files_in_folder(home_folder, target_folder = None, target_file_type = None):
    for current_folder, child_folder, file_name_list in os.walk(home_folder): 
        if ((target_folder != None and (current_folder.split('/')[-1] == target_folder)) or (target_folder == None)):
            #there is target folder required and target folder is currently or there is no target folder required then return all files filter in type
            if (target_file_type == None):
                yield [current_folder + '/' + file_name for file_name in file_name_list]
            else :
                yield [current_folder + '/' + file_name for file_name in filter (lambda file_name : file_name.split('.')[-1] == target_file_type, file_name_list)]
        #fetch next layer folder
        # if (len(child_folder) > 0):
        #     for child in child_folder:
        #         yield from search_files_in_folder(child, target_folder, target_file_type)

def delete_files_in_folders(home_folder, target_folder):
    for current_folder, child_folder, file_name_list in os.walk(home_folder): 
        if (target_folder != None and (current_folder.split('/')[-1] == target_folder)):
            shutil.rmtree(current_folder)
            os.mkdir(current_folder)
        #fetch next layer folder
        # elif (len(child_folder) > 0):
        #     for child in child_folder:
        #         delete_folders(current_folder + '/' + child, target_folder)
        # else:
        #     return

def delete_file(path):
    if os.path.exists(path):
        os.remove(path)

if __name__ == '__main__':
    # files = [x for x in search_files_in_folder('/home/sam/works/cheetah_etl/src', target_folder='ops')]
    delete_files_in_folders('/home/sam/works/cheetah_etl', 'yml')
    # print(files)