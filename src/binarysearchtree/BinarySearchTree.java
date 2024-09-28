package binarysearchtree;


public class BinarySearchTree {

    Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        while(true) {
            Node temp = root;
            if(value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else if(value > temp.value) {
                if(temp.right == null) {
                    temp.right= newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                return false;
            }
        }
    }

    public boolean contains(int value) {

        Node temp = root;

        while(temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int data) {
            this.value = data;
        }
    }
}
