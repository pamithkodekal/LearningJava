package LinkedList;

public class LinkedListFromScratch {

    public static void main(String[] args) {

        Node Node1 = new Node(20);
        Node Node2 = new Node(10);
        Node Node3 = new Node(30);
        Node Node4 = new Node(40);

        Node1.next = Node2;
        Node2.next = Node3;
        Node3.next = Node4;
      
        System.out.println(Node1.data);
        System.out.println(Node1.next.data);
        System.out.println(Node1.next.next.data);
        
      
    }
}

 class Node {

    int data;
    Node next;
    
    Node (int data){
        this.data = data;
       
    }
    

}