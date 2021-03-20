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

        tree.printPaths(tree.root);
    }

    void printArray (int pathInt[], int len){
        for (int i=0; i<len; i++){
            System.out.print(pathInt[i] + " ");
        }
        System.out.println("");
    }
    void printPathsRecur (Node node, int path[], int pathLen){
        if (node == null) return;

        path[pathLen] = node.data;
        pathLen++;

        if (node.left == null && node.right ==null){
            printArray(path, pathLen);
        } else {
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }

    void printPaths(Node node){
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }
}
