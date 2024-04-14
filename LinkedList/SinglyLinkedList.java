package LinkedList;

public class SinglyLinkedList {
    static Node head;

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.printList();

        list.addLast(30);
        list.addLast(50);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of list : " + list.sizeOfList(head));
        
    }

    //Add at first position
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add at last position
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //Print the linked list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            
        }
        System.out.println();
    }

    //Delete first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    //Delete last node
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        prevNode.next = null;
    }

    //Size of linked list
    public int sizeOfList(Node head){

        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }
        return size;
    }
}
