package My_Linked_List;

class EmptyLinkedList extends Exception{
    EmptyLinkedList(){super("The Linked List is empty");}
    EmptyLinkedList(String s){super(s);}
}