package My_Linked_List_Java;

import java.lang.reflect.Array;

class myDoublyLinkedList <E> {
    Node head;

    class Node{
        Node prev;
        E data;
        Node next;

        public Node(E data) {
            prev = null;
            this.data = data;
            next = null;
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    void print(){
        if (isEmpty()){
            System.out.println("The Linked List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void clear(){
        head = null;
    }

    Node traverseTo(int index) throws NoElementFoundException{
        Node temp = head;
        int i;
        for (i = 0; i < index; i++){
            if (temp == null) break;
            else temp = temp.next;
        }

        if (temp == null) throw new NoElementFoundException("There is no element at index: " + i);
        return temp;
    }

    int length(){
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    void add(E data){
        if (isEmpty()) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.prev = temp;
    }

    void insertAtFront(E data){
        head.prev = new Node(data);
        head.prev.next = head;
        head = head.prev;
    }

    void insert(int index, E data) throws NoElementFoundException{
        if (index == 0){
            insertAtFront(data);
            return;
        }

        Node temp = traverseTo(index - 1);
        if (temp.next == null) {
            temp.next = new Node(data);
            temp.next.prev = temp;
            return;
        }

        Node toInsert = new Node(data);
        temp.next.prev = toInsert;
        toInsert.next = temp.next;
        toInsert.prev = temp;
        temp.next = toInsert;
    }

    void popAtFront() throws EmptyLinkedListException {
        if (isEmpty()) throw new EmptyLinkedListException();
        else head = head.next;
        head.prev = null;
    }

    void popAtBack() throws EmptyLinkedListException {
        if (isEmpty()) throw new EmptyLinkedListException();

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    void pop (int index) throws NoElementFoundException, EmptyLinkedListException {
        if (index == 0) {
            popAtFront();
            return;
        }

        Node temp = traverseTo(index);
        if (temp.next == null) {
            temp.prev.next = null;
            return;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }

    E getElementAt(int index) throws NoElementFoundException {
        Node temp = traverseTo(index);
        return temp.data;
    }

    int getIndexOf(E e) throws NoElementFoundException {
        int count = 0;
        Node temp = head;

        while (temp != null && temp.data != e) {
            temp = temp.next;
            count++;
        }
        if (temp == null) throw new NoElementFoundException("There is no element with data: " + e);
        else return count;
    }

    boolean contains(E data){
        try{
            if (getIndexOf(data) > -1) return true;
            else return false;
        }catch (NoElementFoundException e) {
            return false;
        }
    }

    void setElementAt(int index, E data) throws NoElementFoundException {
        Node temp = traverseTo(index);
        temp.data = data;
    }

    void reverse() throws EmptyLinkedListException {
        if (isEmpty()) throw new EmptyLinkedListException();

        Node temp = head;
        Node temp1 = head.next;

        while (temp1 != null) {
            insertAtFront(temp1.data);
            temp1 = temp1.next;
        }
        temp.next = null;
    }

    E[] toArray(){
        int l = length();
        E[] array = (E[])(Array.newInstance(head.data.getClass(), l));
        Node temp = head;

        for (int i = 0; i < l; i++){
            array[i] = temp.data;
            temp = temp.next;
        }
        return array;
    }
}