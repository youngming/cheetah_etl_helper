from enum import Enum
import threading
import logging
from etl.helper.utils.common.file_operation import delete_file
import yaml
from itertools import groupby


class ScanErrorException(Exception):
    pass

# Message which can be sent/received from Messager base interface 
class MessageBase(object):
    
    def __eq__(self, o: object) -> bool:
        return super().__eq__(o)
    
    def __init__(self, level, summary, msg, addition_info, raiser) -> None:
        super().__init__()
        self.__level = level
        self.__raiser = raiser
        self.__summary = summary
        self.__message = msg
        self.__addition_info = addition_info
    
    @property
    def level(self):
        return self.__level

    @property
    def is_block(self):
        return self.__level == MessageLevel.ERROR

    @property
    def message(self):
        return self.__message

    @property
    def summary(self):
        return self.__summary

    @property
    def raiser(self):
        return self.__raiser

    @property
    def addition_info(self):
        return self.__addition_info

    def __str__(self) -> str:
        return '<{0}>-<{1}>: {2}'.format(self.level.name, self.summary.name, self.message)
        
    __repr__ = __str__

class ScanMessage(MessageBase):
    pass

class InfoMessage(MessageBase):
    pass

class MessageLevel(Enum):
    ERROR=1
    WARNING=2
    INFO=3

class MessageSummary(Enum):
    ItemDuplicated=1
    ReferenceLimitationExceeded=2
    OutputTableNameUnmatched=3
    InsertTableColumnUnmatched=4
    Environment=500


# Listerner base interface in Messager
# Implement in feature on requirement
class ListenerBase(object):
    
    def __eq__(self, o: object) -> bool:
        return super().__eq__(o)


# Messager send/receive/listener management
class Messager(object):
    
    _instance_lock = threading.Lock()
    
    @staticmethod
    def get_instance():
        return Messager()

    # Hidden the __init__ all init job run in __new__ method
    def __init__(self):
        pass

    def __new__(cls):

        if not hasattr(Messager, "_instance"):
            with Messager._instance_lock:
                if not hasattr(Messager, "_instance"):
                    Messager._instance = object.__new__(Messager)
                    Messager._instance.__messages = list()
                    
        return Messager._instance
    
    # Implement in feature on requirement
    def add_listener(self, listener):
        pass
    
    # Implement in feature on requirement
    def remove_listener(self, listener):
        pass

    # Save and send a message
    def send(self, message):
        self.__messages.append(message)

    @property
    def messages(self):
        return self.__messages
    
    def level_messages(self, level):
        return list(filter(lambda message: message.level == level, self.messages))

    def raise_item_duplicated(self, msg, addition_info = '', raiser = None):
        self.send(ScanMessage(MessageLevel.ERROR, MessageSummary.ItemDuplicated, msg, addition_info, raiser))
    
    def raise_output_unmatched(self, msg, addition_info = '', raiser = None):
        self.send(ScanMessage(MessageLevel.ERROR, MessageSummary.OutputTableNameUnmatched, msg, addition_info, raiser))
    
    def raise_reference_limited(self, msg, addition_info = '', raiser = None):
        self.send(ScanMessage(MessageLevel.ERROR, MessageSummary.ReferenceLimitationExceeded, msg, addition_info, raiser))
    
    def raise_insert_columns_unmatched_confirm(self, msg, addition_info = '', raiser = None):
        self.send(ScanMessage(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, msg, addition_info, raiser))

    def raise_insert_columns_unmatched_probably(self, msg, addition_info = '', raiser = None):
        self.send(ScanMessage(MessageLevel.WARNING, MessageSummary.InsertTableColumnUnmatched, msg, addition_info, raiser))
    
    def save_env(self, env):
        self.send(InfoMessage(MessageLevel.INFO, MessageSummary.Environment, env, '', None))

    def checkout(self, output_file):
        self.__output_message(output_file, self.messages)
        if(len(self.level_messages(MessageLevel.ERROR)) > 0):
            raise ScanErrorException()

    def __output_message(self, file_path, message_list):
        # Generate info print
        info_messages = self.level_messages(MessageLevel.INFO)
        for info_message in info_messages:
            logging.warn('==============Info: {0} - {1}=============='.format(info_message.summary.name, info_message.message))


        # Generate console output summary
        error_messages = self.level_messages(MessageLevel.ERROR)
        warning_messages = self.level_messages(MessageLevel.WARNING)
        error_items = list([key for (key, data) in groupby(error_messages, key = lambda msg: msg.raiser) if key is not None])
        warning_items = list([key for (key, data) in groupby(warning_messages, key = lambda msg: msg.raiser) if key is not None])
        logging.warn('==============Total: {0} error in {1} raiser | {2} warning in {3} raiser=============='.format(len(error_messages), len(error_items), len(warning_messages), len(warning_items)))
        
        from etl.helper.module.ETL_element import ElementBase
        for error_item in error_items:
            if(isinstance(error_item, ElementBase)):
                logging.warn('Error: {0}'.format(error_item.show_name))
            else:
                logging.warn('Error: {0}'.format(error_item))
        
        for warning_item in warning_items:
            if(isinstance(warning_item, ElementBase)):
                logging.warn('Warning: {0}'.format(warning_item.show_name))
            else:
                logging.warn('Warning: {0}'.format(warning_item))

        # Generate output file
        msg_save = []
        message_list.sort(key = lambda msg: msg.level.value)
        for message in message_list:
            raiser = ''
            msg = message.message
            addition_info = message.addition_info
            # logging.warning(message)
            if(message.raiser is not None and isinstance(message.raiser, ElementBase)):
                raiser = message.raiser.path
            msg_save.append('<{0}>-<{1}> raiser:{2} {3} msg:{4}'.format(message.level.name, message.summary.name, raiser, addition_info, msg))
        
        delete_file(file_path)
        if(len(msg_save) > 0 ):
            with open(file_path , 'w+') as yaml_writer:
                yaml.dump(msg_save, yaml_writer)


    
if __name__ == '__main__':
    messager_get_from_instance = Messager.get_instance()
    messager_get_from_init = Messager()
    print(messager_get_from_instance == messager_get_from_init)

    msg1 = ScanMessage(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, 'msg1', addition_info = 'add-msg1', raiser = '1')
    msg2 = ScanMessage(MessageLevel.WARNING, MessageSummary.OutputTableNameUnmatched, 'msg2', addition_info = 'add-msg2', raiser = '1')
    msg3 = ScanMessage(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, 'msg3', addition_info = 'add-msg3', raiser = '1')

    messager_get_from_instance.send(msg1)
    messager_get_from_instance.send(msg2)

    messager_get_from_init.checkout('/home/sam/cheetah_etl/xxx.yml')

    print(msg1.is_block)
    print(msg2.is_block)

    print(messager_get_from_instance.messages)
    print(messager_get_from_instance.level_messages(MessageLevel.ERROR))
    print(messager_get_from_instance.level_messages(level=MessageLevel.WARNING))
    print(messager_get_from_instance.level_messages(level=MessageLevel.INFO))


