package com.paolo;

public class BinaryTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printInorder();
        tree.printPostOrder();
        tree.printPreOrder();
    }

    Node root;

    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

    void printPostOrder(){printPostOrder(root);}
    void printInorder(){printInorder(root);}
    void printPreOrder(){printPreOrder(root);}

    void printPostOrder(Node node){
        if (node == null){
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node){
        if (node == null){
            return;
        }

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreOrder(Node node){
        if (node == null) return;
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}

class Node {
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
