package DSA.DoublyLinkedList.PartitionLists;

public class DoublyLinkedList {

    private Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
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
            newNode.prev = current;
        }
    }

    public void partitionList(int x) {
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node prev1 = d1;
        Node prev2 = d2;
        Node runner = head;

        while (runner != null) {
            if (runner.value < x) {
                prev1.next = runner;
                runner.prev = prev1;
                prev1 = runner;
            } else {
                prev2.next = runner;
                runner.prev = prev2;
                prev2 = runner;
            }

            runner = runner.next;

        }
        prev2.next = null;
        prev1.next = d2.next;
        if (d2.next != null) {
            d2.next.prev = prev1;
        }
        head = d1.next;
        if (head != null) {
            head.prev = null;
        }



    }

}







