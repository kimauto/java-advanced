package day06.collection.linkedlist;

public class Node<T> {
    T data;
    Node<T> next = null;


    public Node(T data) {
        this.data = data;
    }
}
