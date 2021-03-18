from enum import Enum
import threading
import logging
from etl.helper.utils.common.file_operation import delete_file
import yaml
from itertools import groupby
from distutils.util import strtobool


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

    def __hash__(self) -> int:
        return super().__hash__()
        
    __repr__ = __str__

class ScanMessage(MessageBase):
    def __eq__(self, o: object) -> bool:
        if(isinstance(o, ScanMessage)):
            return o.raiser == self.raiser and o.summary == self.summary
        else:
            return super().__eq__(o)

    def __hash__(self) -> int:
        return hash(self.raiser) + hash(self.summary)

class InfoMessage(MessageBase):
    pass

class MessageLevel(Enum):
    ERROR=1
    WARNING=2
    INFO=3
    NOTIFY_RECOMMEND=4

class MessageSummary(Enum):
    ItemDuplicated=1
    ReferenceLimitationExceeded=2
    OutputTableNameUnmatched=3
    InsertTableColumnUnmatched=4
    Environment=500
    Notify_depth_limit_identify=700
    Notify_ignore_error_check=701
    Notify_ignore_warning_check=702


# Listerner base interface in Messager
# Implement in feature on requirement
class ListenerBase(object):
    pass


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
    def __send(self, message):
        from etl.helper.module.ETL_element import FileElement
        if isinstance(message.raiser, FileElement):
            if(message.level == MessageLevel.ERROR and 'ignore_error_check' in message.raiser.header.keys() and strtobool(message.raiser.header['ignore_error_check'])):
                return
            if(message.level == MessageLevel.WARNING and 'ignore_warning_check' in message.raiser.header.keys() and strtobool(message.raiser.header['ignore_warning_check'])):
                return
        self.__messages.append(message)

    @property
    def messages(self):
        return self.__messages
    
    def level_messages(self, level):
        return list(filter(lambda message: message.level == level, self.messages))

    def raise_item_duplicated(self, msg, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.ERROR, MessageSummary.ItemDuplicated, msg, addition_info, raiser))
    
    def raise_output_unmatched(self, msg, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.ERROR, MessageSummary.OutputTableNameUnmatched, msg, addition_info, raiser))
    
    def raise_reference_limited(self, msg, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.ERROR, MessageSummary.ReferenceLimitationExceeded, msg, addition_info, raiser))
    
    def raise_insert_columns_unmatched_confirm(self, msg, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, msg, addition_info, raiser))

    def raise_insert_columns_unmatched_probably(self, msg, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.WARNING, MessageSummary.InsertTableColumnUnmatched, msg, addition_info, raiser))
    
    def raiser_notify_recommend(self, msg, message_summary, addition_info = '', raiser = None):
        self.__send(ScanMessage(MessageLevel.NOTIFY_RECOMMEND, message_summary, msg, addition_info, raiser))

    def save_env(self, env):
        self.__send(InfoMessage(MessageLevel.INFO, MessageSummary.Environment, env, '', None))

    def checkout(self, output_file):
        self.__output_message(output_file, self.messages)
        if(len(self.level_messages(MessageLevel.ERROR)) > 0):
            raise ScanErrorException()

    def __output_message(self, file_path, message_list):
        # Generate info print
        info_messages = self.level_messages(MessageLevel.INFO)
        for info_message in info_messages:
            logging.warn('============== Info: {0} - {1} =============='.format(info_message.summary.name, info_message.message))


        # Generate console output summary
        # Totaly message
        error_messages = self.level_messages(MessageLevel.ERROR)
        warning_messages = self.level_messages(MessageLevel.WARNING)
        
        # All message aggregated in raiser with SET data struct (merge the same raiser's message on equals and hash method)
        raiser_error_mapping = {raiser:set(messageList) for (raiser, messageList) in groupby(error_messages, key = lambda msg: msg.raiser) if raiser is not None}
        raiser_warning_mapping = {raiser:set(messageList) for (raiser, messageList) in groupby(warning_messages, key = lambda msg: msg.raiser) if raiser is not None}
        
        # All message aggregated in raiser with LIST data struct (do not merge the message)
        raiser_error_mapping_list = {raiser:list(messageList) for (raiser, messageList) in groupby(error_messages, key = lambda msg: msg.raiser) if raiser is not None}
        raiser_warning_mapping_list = {raiser:list(messageList) for (raiser, messageList) in groupby(warning_messages, key = lambda msg: msg.raiser) if raiser is not None}
        
        # All raiser list (merge the same raiser's message to one)
        error_items = list([key for (key, data) in groupby(error_messages, key = lambda msg: msg.raiser) if key is not None])
        warning_items = list([key for (key, data) in groupby(warning_messages, key = lambda msg: msg.raiser) if key is not None])
        
        s_error = ''
        s_warning = ''
        if(len(error_items) > 1):
            s_error = 's'
        if(len(warning_items)):
            s_warning = 's'

        logging.warn('============== Total: {0} error in {1} raiser{4}  |  {2} warning in {3} raiser{5} =============='.format(len(error_messages), len(error_items), len(warning_messages), len(warning_items), s_error, s_warning))
        
        from etl.helper.module.ETL_element import FileElement
        for error_item in error_items:
            raiser_name = ''
            if(isinstance(error_item, FileElement)):
                raiser_name = error_item.show_name
            else:
                raiser_name = error_item
            
            logging.warn('Error: {0}-{1} ({2})'.format('/'.join([msg.summary.name for msg in raiser_error_mapping[error_item]]), raiser_name, len(raiser_error_mapping_list[error_item])))

        for warning_item in warning_items:
            raiser_name = ''
            if(isinstance(warning_item, FileElement)):
                raiser_name = warning_item.show_name
            else:
                raiser_name = warning_item

            logging.warn('Warning: {0}-{1} ({2})'.format('/'.join([msg.summary.name for msg in raiser_warning_mapping[warning_item]]), raiser_name, len(raiser_warning_mapping_list[warning_item])))


        # Generate notify and recommend info
        logging.warn('======================================= Notify and recommended =======================================')
        notify_messages = sorted(self.level_messages(MessageLevel.NOTIFY_RECOMMEND), key = lambda msg: msg.summary.value)
        for notify_message in notify_messages:
            raiser_name = ''
            if(isinstance(warning_item, FileElement)):
                raiser_name = warning_item.show_name
            else:
                raiser_name = warning_item
            logging.warn('Notify: {0} - {1} : {2}'.format(notify_message.summary.name, raiser_name, notify_message.message))

        logging.warn('======================================================================================================')

        # Generate output file
        msg_save = []
        message_list.sort(key = lambda msg: msg.level.value)
        for message in message_list:
            raiser = ''
            msg = message.message
            addition_info = message.addition_info
            # logging.warning(message)
            if(message.raiser is not None and isinstance(message.raiser, FileElement)):
                raiser = message.raiser.path
            elif(message.raiser is not None):
                raiser = message.raiser
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

    # messager_get_from_instance.send(msg1)
    # messager_get_from_instance.send(msg2)

    messager_get_from_init.checkout('/home/sam/cheetah_etl/xxx.yml')

    print(msg1.is_block)
    print(msg2.is_block)

    print(messager_get_from_instance.messages)
    print(messager_get_from_instance.level_messages(MessageLevel.ERROR))
    print(messager_get_from_instance.level_messages(level=MessageLevel.WARNING))
    print(messager_get_from_instance.level_messages(level=MessageLevel.INFO))


