package My_Linked_List;

class runner{
    static boolean hasLoop(mySinglyLinkedList m) {
        //Floyd’s Cycle-Finding Algorithm
        //Two Pointers
        mySinglyLinkedList.Node byOne = m.head;
        mySinglyLinkedList.Node byTwo = m.head;

        while (byOne != null && byTwo != null && byTwo.next != null){
                byOne = byOne.next;
                byTwo = byTwo.next.next;
                if (byOne == byTwo) return true;
        }
        return false;
    }

    static void createLoopAt(int index, mySinglyLinkedList m) throws NoElementFoundException, LoopDetectedException {
        if (hasLoop(m)) throw new LoopDetectedException("The Linked List is already Looped");
        mySinglyLinkedList.Node temp = m.traverseTo(index);

        mySinglyLinkedList.Node temp1 = temp;
        while(temp1.next != null) temp1 = temp1.next;
        temp1.next = temp;
    }

	public static void main(String[] args) throws NoElementFoundException, EmptyLinkedListException, LoopDetectedException {
        mySinglyLinkedList <Integer> s = new mySinglyLinkedList();
        s.add(12);
//        System.out.println(s.head);
        s.add(13);
        s.add(14);
//        s.setElementAt(2, 10);
        s.print();
//        s.reverse();
//        s.clear();
//        s.insert(1, 15);
//        s.insert(4, 16);
//        s.insert(6, 10);
//        s.insertAtFront(2);
//        System.out.println(s.length());
//        try{
//        s.pop(3);
//        }catch (NoElementFound e){
//            System.out.println("yahoo");
//            System.out.println(e);
//            System.out.println(e.getCause());
//            System.out.println(e.getStackTrace());
//            e.fillInStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.getLocalizedMessage());
//        }
//        s.popAtFront();
//        s.popAtBack();
//        s.print();
//        System.out.println(s.getIndexOf(2));
//            System.out.println(s.getElementAt(6));
//        System.out.println(s.hasLoop());
//        System.out.println(hasLoop(s));
//        createLoopAt(2, s);
//        System.out.println(hasLoop(s));

        //By Tushar Sahu

    }
}