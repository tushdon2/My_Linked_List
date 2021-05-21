# [runner.java](../runner.java)
The ```main``` method of the class [```runner```](../runner.java) implements various methods of [```mySinglyLinkedList```](../mySinglyLinkedList.java) class.

The ```runner``` class also has other member methods as follows:
* ##### ```hasLoop(mySinglyLinkedList m)```
  Returns ```true``` if the linked list ```m``` is looped else returns ```false```. It implements the Floyd’s Cycle-Finding Algorithm using two pointers.
* ##### ```createLoopAt(int index, mySinglyLinkedList m)```
  It creates a loop in the linked list ```m``` such that the current end of the linked list starts pointing at index: ```index```. Throws ```LoopDetectedException``` if the linked list already has a loop. Throws ```NoElementFoundException``` if there is no node at the passed index.