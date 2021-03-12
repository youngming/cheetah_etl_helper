from enum import Enum
import threading

# Message which can be sent/received from Messager base interface 
class MessageBase(object):
    
    def __eq__(self, o: object) -> bool:
        return super().__eq__(o)
    
    def __init__(self, level, summary, msg) -> None:
        super().__init__()
        self.__level = level
        self.__summary = summary
        self.__message = msg
    
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

    def __str__(self) -> str:
        return '<{0}>-<{1}>: {2}'.format(self.level.name, self.summary.name, self.message)
        
    __repr__ = __str__

class Message(MessageBase):
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

    def raise_item_duplicated(self, msg):
        self.send(Message(MessageLevel.ERROR, MessageSummary.ItemDuplicated, msg))
    
    def raise_output_unmatched(self, msg):
        self.send(Message(MessageLevel.ERROR, MessageSummary.OutputTableNameUnmatched, msg))
    
    def raise_reference_limited(self, msg):
        self.send(Message(MessageLevel.ERROR, MessageSummary.ReferenceLimitationExceeded, msg))
    
    def raise_insert_columns_unmatched_confirm(self, msg):
        self.send(Message(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, msg))

    def raise_insert_columns_unmatched_probably(self, msg):
        self.send(Message(MessageLevel.WARNING, MessageSummary.InsertTableColumnUnmatched, msg))
    
if __name__ == '__main__':
    messager_get_from_instance = Messager.get_instance()
    messager_get_from_init = Messager()
    print(messager_get_from_instance == messager_get_from_init)

    msg1 = Message(MessageLevel.ERROR, MessageSummary.InsertTableColumnUnmatched, 'msg1')
    msg2 = Message(MessageLevel.WARNING, MessageSummary.OutputTableNameUnmatched, 'msg2')

    messager_get_from_instance.send(msg1)
    messager_get_from_instance.send(msg2)

    print(msg1.is_block)
    print(msg2.is_block)

    print(messager_get_from_instance.messages)
    print(messager_get_from_instance.level_messages(MessageLevel.ERROR))
    print(messager_get_from_instance.level_messages(level=MessageLevel.WARNING))
    print(messager_get_from_instance.level_messages(level=MessageLevel.INFO))


