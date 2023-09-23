Memento pattern is a behavioral design pattern. Memento pattern is used to restore state of an object to a previous state. 
As your application is progressing, you may want to save checkpoints in your application and restore back to those checkpoints later.

![img.png](img.png)

originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
memento : the object that is going to maintain the state of originator. Its just a POJO.
caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.