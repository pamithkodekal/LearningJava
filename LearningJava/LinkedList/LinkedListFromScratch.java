package LinkedList;

class Node {

    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // Add at beginning
    public void addFirst(String data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete first node
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Delete last node
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
    }

    // Display list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class LinkedListFromScratch {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("Add Last:");
        list.addLast("10");
        list.addLast("20");
        list.addLast("30");
        list.display();

        System.out.println("\nAdd First:");
        list.addFirst("5");
        list.display();

        System.out.println("\nDelete First:");
        list.deleteFirst();
        list.display();

        System.out.println("\nDelete Last:");
        list.deleteLast();
        list.display();
    }
}