package Collections;

public class LList<T> {
    Node head;
    Node tail;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //Operation methods
    public void addFirst(T a) {
        Node node = new Node(a);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //add method adds at last
    public void add(T data) {
        if (tail == null) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    //insert into list method
    public void  insertAfter(T afterData, T data){
        Node current = head;
        while(current.data!=afterData) current=current.next;
        Node node = new Node(data);
        node.next=current.next;
        current.next=node;
    }

    //print list method
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node current = head;
        while (current.next != null) {   //I guess this will skip last one so...
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }


    public static void main(String[] args) {
        LList<Integer> myLinkedList = new LList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.addFirst(15);
        myLinkedList.addFirst(16);
        myLinkedList.insertAfter(15,10);
        myLinkedList.printList();

    }
}
