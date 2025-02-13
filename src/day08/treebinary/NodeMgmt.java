package day08.treebinary;

public class NodeMgmt {
    Node head;

    public class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else { //CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.data) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }

                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때

                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }

                }

            }

        }


        return true;
    }

    public Node search(int data) {
        //CASE 1 : Node가 하나도 없을때
        if (this.head == null) {
            return null;
            //CASE 2 : Node가 하나 이상일때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.data == data) {
                    return findNode;
                } else if (data < findNode.data) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }


            }

        }


        return null;
    }
    //Case 1 : head 노드가 null일경우
    //Case 2 : head 노드가 null일경우

//    public Node removeNode(int data) {
//        Node search = search(data);
//        if (search == null) {
//            return null;
//        }
//
//        while (true) {
//            //자식이 없는 노드에 대한 삭제
//            if (search.left == null && search.right == null) {
//                search = null;
//                return search;
//            }
//            //왼쪽 자식만 있는 노드에 대한 삭제
//            else  if (search.left != null && search.right == null) {
//                search = search.left;
//                return search;
//            }
//
//            //오른쪽 자식만 있는 노드에 대한 삭제
//            else if (search.left == null && search.right != null) {
//                search = search.right;
//                return search;
//            }
//            //왼쪽 자식, 오른쪽 자식 둘 다 있는 노드에 대한 삭제
//            else if (search.left != null && search.right != null) {
//
//                search = search.right;
//                return search;
//            }
//        }
//        return null;
    }




