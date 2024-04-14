package LinkedList;
import java.util.LinkedList;

public class Collection {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(10);
        // list.push(10); //add element at first position
        list.addLast(30);
        list.add(50);
        list.add(3,40);
        System.out.println(list);

        int size = list.size();
        System.out.println("Size : "+size);

        list.removeFirst();
        // list.pop(); //remove first element
        // list.removeLast();
        list.remove();
        // list.remove(2);
        // list.clear();
        System.out.println(list);

        list.addFirst(10);
        list.addFirst(20);

        System.out.print("List : ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        int value = list.get(3);
        // int value1 = list.getFirst();
        // int value2 = list.peek(); //get first element
        // int value3 = list.getLast();
        System.out.println("Value at index 3 : " + value);

        int index = list.indexOf(30);
        // int index1 = list.lastIndexOf(30); // return last occurance index
        System.out.println("Index of 30 : " + index);


        System.out.println(list);

        // LinkedList<Integer> sec_list = new LinkedList<Integer>(); 

        // sec_list = (LinkedList) list.clone(); //create a shallow copy
        // System.out.println(sec_list);

        Object arr[];
        arr = list.toArray();
        System.out.println(arr[2]);
    }
}