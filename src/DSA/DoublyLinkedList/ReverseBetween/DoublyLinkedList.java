package DSA.DoublyLinkedList.ReverseBetween;

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

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null || startIndex == endIndex) {
            return;

        }
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;
        Node prev1 = dummy;
        for (int i = 0; i < startIndex; i++) {
            prev1 = prev1.next;
        }
        Node current = prev1.next;
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node toMove = current.next;
            current.next = toMove.next;
            if (toMove.next != null) {
                toMove.next.prev = current;
            }
            toMove.next = prev1.next;
            prev1.next.prev = toMove;
            prev1.next = toMove;
            toMove.prev = prev1;

        }
        head = dummy.next;
        head.prev = null;
    }

}










