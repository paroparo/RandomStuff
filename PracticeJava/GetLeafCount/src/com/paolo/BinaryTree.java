package com.paolo;

class Node{
    int data;
    Node left, right;

    Node(int d){
        data = d;
        left = right = null;
    }
}
public class BinaryTree {

    Node root;
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.getLeafCount());
    }

    int getLeafCount(Node node){
        int leafCount;
        if (node == null){
            leafCount = 0;
        } else if (node.left == null && node.right == null){
            leafCount = 1;
        } else {
            leafCount = getLeafCount(node.left) + getLeafCount(node.right);
        }
        return leafCount;
    }

    int getLeafCount() {
        return getLeafCount(root);
    }
}
