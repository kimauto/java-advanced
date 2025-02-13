package day08.treebinary;

public class Main {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();

        myTree.insertNode(10);
        myTree.insertNode(16);
        myTree.insertNode(14);
        myTree.insertNode(20);
        myTree.insertNode(5);
        myTree.insertNode(4);
        myTree.insertNode(17);
        myTree.insertNode(13);
        myTree.insertNode(22);
        myTree.insertNode(25);

        System.out.println(myTree.head.right.right.data);
    }


}
