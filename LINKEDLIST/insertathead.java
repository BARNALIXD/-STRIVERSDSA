class Node {
    public int data;
    public Node next;

    //constructor ith both data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    //constructor with only data (assuming next is initially null)
    public Node(int data1.Node next1) {
        data = data1;
        next = next1;
    }

    //constructor with only data(assuming next is initially null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main{
    //Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    } 

    public static void main(String[] args) {
        //Sample array and value for insertion
        List<Integer>arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        //Creating a linked list with initial elements from the array
        Node head = new Node (arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = insertHead(head, val);

        printLL(head);
    }
}