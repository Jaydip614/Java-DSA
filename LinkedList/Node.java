package LinkedList;

public class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListExaple {
    public static void main(String[] args) {
        
        Node newNode = new Node(5);

        System.out.println("data : " + newNode.data);
        System.out.println("next : " + newNode.next);
        System.out.println("Address of newNode : " + newNode);

        Node head = newNode;

        System.out.println("Address of head : " + head);
        System.out.println("data : " + head.data);
        System.out.println("next : " + head.next);
    }
}
