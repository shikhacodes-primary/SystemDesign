package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.printList();

//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.removeLast();
        linkedList.reverse();
        linkedList.printList();
    }
}
