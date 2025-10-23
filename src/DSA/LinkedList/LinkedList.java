package DSA.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println(head.value);
    }
    public void getTail() {
        System.out.println(tail.value);
    }
    public void getLength() {
        System.out.println(length);
    }

    public void append(int value) {
        Node temp = new Node(value);
        if (length == 0) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            System.out.println("reached end of linked list");
            return null;
        } else {
            Node pre = head;
            Node temp = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return tail;
        }
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        length--;
        return head;
    }

    public Node getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean setNode(int index, int value) {
//        if (index < 0 || index >= length) {
//            return false;
//        }
//        Node temp = head;
//        for (int i=0; i<index; i++) {
//            temp = temp.next;
//        }
//        temp.value = value;
//        return true;

        Node temp = getNode(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node node = new Node(value);
            Node prev = getNode(index-1);
            node.next = prev.next;
            prev.next = node;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();
        Node prev = getNode(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    /*
    4->5->6->7->8
    Head points to 4 tail to 8
    To reverse a LL, we first exchange head and tail pointers.
    4->5->6->7->8
    Head points to 8 tail to 4
    Now we reverse the pointing of each node
    so we make it like this:
    4<-5<-6<-7<-8
    */
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp;

        for (int i = 0; i < length; i++) {
             after = temp.next;
             temp.next = before;
             before = temp;
             temp = after;
        }

    }
}
