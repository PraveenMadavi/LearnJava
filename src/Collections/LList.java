package Collections;

import java.util.Objects;

public class LList<T> {
    private Node head;
    private Node tail;

    private class Node {
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
        if (Objects.isNull(head)) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //Add method
    public void add(T data) {
        if (Objects.isNull(tail)) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    //Insert method
    public void insertAfter(T afterData, T data) {
        //handle null pointer
        Node current = head;
        while (current.data != afterData) current = current.next;
        Node node = new Node(data);
        node.next = current.next;
        current.next = node;
    }

    //Remove element from list
    public void removeElement(T data) {
        // if list is empty
        if (Objects.isNull(head)) {
            System.out.println("The List is empty.");
            return;
        }
        //Removing first element
        if (Objects.equals(head.data,data)) {
            head = head.next;
            //if list becomes empty after removal.
            if (Objects.isNull(head)) {
                tail = null;
            }
            System.out.println("Element removed from the beginning of the list");
            return;
        }
        //Traverse the rest to remove if found
        Node current = head;
        while (current.next != null) {
            if (Objects.equals(current.next.data,data)) {
                //if element is in tail, update tail
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                System.out.println("Element is removed from the list");
                return;
            }
            current = current.next;
        }
        System.out.println("element is not found in the list.");
    }

    // Reverse the list
    public  void reverseList(){
        if (Objects.isNull(head)){
            System.out.println("The list is empty.");
            return;
        }
        if (head==tail){
            System.out.println(head.data);
            return;
        }
        Node current = head;
        Node prev = null;
        Node nxt ;
        tail=head;
        while (current!=null){
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
        head=prev;
    }


    //Print list method
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
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
        myLinkedList.insertAfter(15, 10);
        myLinkedList.printList();
        int data = 5;
        myLinkedList.removeElement(data);
        System.out.println("After removal of " + data);
        myLinkedList.printList();
        System.out.println("After reverse the list");
        myLinkedList.reverseList();
        myLinkedList.printList();
        System.out.println("After add another data at Tail and Head");
        myLinkedList.add(17);
        myLinkedList.addFirst(5);
        myLinkedList.printList();
    }
}
