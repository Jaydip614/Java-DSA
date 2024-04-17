package LinkedList;

public class ReverseList {
    
    static Node head;

    public static void main(String[] args) {
        ReverseList list = new ReverseList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.printList(head);

        // head = reverseList(head);
        head = recursiveReverseList(head);

        list.printList(head);
        
    }

    //Reverse LinkedList by iterative approach
    public static Node reverseList(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nexNode;
        }
        head.next = null;
        head = prevNode;

        return head;
    }

    //Reverse LinkedList by recursive approach
    public static Node recursiveReverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = recursiveReverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
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
    public void printList(Node head){
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
}
