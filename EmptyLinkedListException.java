package My_Linked_List;

class EmptyLinkedListException extends Exception{
    EmptyLinkedListException(){super("The Linked List is empty");}
    EmptyLinkedListException(String s){super(s);}
}