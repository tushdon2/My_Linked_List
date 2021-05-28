# Linked List Exceptions
Following files are used to throw Exceptions at Runtime:
* ### [EmptyLinkedListException.java](../EmptyLinkedListException.java)
  This exception is thrown when the linked list is empty and one tries to use ```popAtFront()```, ```popAtBack()```, ```pop(int index)``` or ```reverse()``` methods of [```mySinglyLinkedList```](../mySinglyLinkedList.java) and [```myDoublyLinkedList```](../myDoublyLinkedList.java) class.
* ### [NoElementFoundException.java](../NoElementFoundException.java)
  This exception is thrown when the required node is not found while using ```traverseTo(int index)```, ```insert(int index, E data)```, ```pop(int index)```, ```getElementAt(int index)```, ```getIndexOf(E e)``` or ```setElementAt(int index, E data)``` methods of [```mySinglyLinkedList```](../mySinglyLinkedList.java) and [```myDoublyLinkedList```](../myDoublyLinkedList.java) class or ```createLoopAt(int index, mySinglyLinkedList m)``` method of [```runner```](../runner.java) class.
* ### [LoopDetectedException.java](../LoopDetectedException.java)
  This exception is thrown when a loop is detected while using ```createLoopAt(int index, mySinglyLinkedList m)``` method of [```runner```](../runner.java) class.
