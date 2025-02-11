package day06.collection.linkedlist;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList<Integer> list = new SingleLinkedList();
        list.addNode(1);
        System.out.println(list.head.data);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.printAll();
    }
}
