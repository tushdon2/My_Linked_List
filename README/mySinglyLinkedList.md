# [mySinglyLinkedList.java](../mySinglyLinkedList.java)

This file contains the class ```mySinglyLinkedList```. A Singly linked List can be made by creating an object of this class as:

```mySinglyLinkedList<E> object = new mySinglyLinkedList()<>;``` where E is data type of the objects to be stored in the Linked List.

Eg. ```E``` can be ```Integer``` for creating a Linked List to store integers.

The Linked List follows zero based indexing.

Implementation can be found in the ```main``` method of ```runner``` class in the [runner.java](../runner.java) file.

This class contains the following members:

* #### ```head```
  It's an object of ```Node``` nested class and will point to the starting node of the Linked List (if not empty else it will point to ```null```).
* #### ```Node```
  It is a nested class inside the class ```mySinglyLinkedList```. All the nodes of the linked list are objects of this class. It has the following members:
    * ##### ```data```
      It is an object of type ```E``` and stores the data in the node.
    * ##### ```next```
      It is an object of type ```Node``` and points to the next node (if the current node is not the last node else it will point to ```null```).
    * ##### constructor
      When an object of class ```Node``` is created, it will store the passed data in the ```data``` member and make the ```next``` member point to ```null```.
* #### ```isEmpty()```
  Checks if the lnked list is empty.
* ##### ```print()```
  Prints the data in the linked list. Shows ```The Linked List is Empty``` if the linked list is empty.
* ##### ```clear()```
  Clears all the data stored in the linked list (makes ```head``` point to ```null```).
* ##### ```traverseTo(int index)```
  Returns the node at index: ```index```. Throws ```NoElementFoundException``` if there is no node at the passed index.
* ##### ```length()```
  Returns the length of the linked list.
* ##### ```add(E data)```
  Adds a node at the end of the linked list with data: ```data```.
* ##### ```insertAtFront(E data)```
  Inserts a node at the front of the linked list with data: ```data```.
* ##### ```insert(int index, E data)```
  Inserts a node at index: ```index``` of the linked list with data ```data```. Throws ```NoElementFoundException``` if there is no node before the passed index.
* ##### ```popAtFront()```
  Removes the node at the start of the linked list. Throws ```EmptyLinkedListException``` if the linked list is empty.
* ##### ```popAtBack()```
  Removes the node at the end of the linked list. Throws ```EmptyLinkedListException``` if the linked list is empty.
* ##### ```pop (int index)```
  Removes the node at index: ```index``` of the linked list. Throws ```NoElementFoundException``` if there is no node before the passed index. Throws ```EmptyLinkedListException``` if the linked list is empty and ```index == 0```.
* ##### ```getElementAt(int index)```
  Returns the data at index: ```index``` of the linked list. Throws ```NoElementFoundException``` if there is no node at the passed index.
* ##### ```getIndexOf(E e)```
  Returns the index at which data ```e``` occurs for the first time. Throws ```NoElementFoundException``` if there is no node with data ```e```.
* ##### ```contains(E data)```
  Returns ```true``` if the linked list contains data ```data``` else returns ```false```.
* ##### ```setElementAt(int index, E data)```
  Edits the current data of node at index: ```index``` to ```data```. Throws ```NoElementFoundException``` if there is no node at the passed index.
* ##### ```reverse()```
  Reverses the linked list. Throws ```EmptyLinkedListException``` if the linked list is empty.
* ##### ```toArray()```
  Returns an array containing the data of the linked list. 