package DSA.LinkedList.PartitionList;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int value) {
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node prev1 = d1;
        Node prev2 = d2;
        Node runner = head;
        while (runner != null) {
            if (runner.value < value) {
                prev1.next = runner;
                prev1 = runner;

            } else {
                prev2.next = runner;
                prev2 = runner;
            }
            runner=runner.next;
        }
        prev2.next = null;
        prev1.next = d2.next;
        head = d1.next;
    }

}





