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
	tree.root.right.left = new Node(4);
	tree.root.right.right = new Node(5);
	tree.root.right.right.right = new Node(5);

        System.out.println(tree.maxDepth(tree.root));

    }

    int maxDepth(Node node){
        int depth;
        if (node == null){
            depth = 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            if(leftDepth > rightDepth) {
                depth = leftDepth + 1;
            } else depth = rightDepth + 1;
        }
        return depth;
    }
}
