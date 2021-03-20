package com.paolo;

public class Main {

    public static void main(String[] args) {
        Main.head = new Node(1);
        Main.head.next = new Node(2);
        Main.head.next.next = new Node(3);
        Main.head.next.next.next = new Node(4);

        Main.printList(head);

        Node reverseHead = Main.reverseIterative(head);
        System.out.println("\n");
        Main.printList(reverseHead);
    }

    public static Node head;

    public static class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }

    public static Node reverseLinkedListRecursive(Node curr, Node prev){
        if (curr.next == null){
            head = curr;
            curr.next = prev;
            return head;
        }

        Node next1 = curr.next;
        curr.next = prev;
        reverseLinkedListRecursive(next1, curr);
        return head;
    }

    public static Node reverseIterative(Node node){
        Node prev = null;
        Node curr = node;
        Node next1 = null;

        while (curr != null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        node = prev;
        return node;
    }

    public static void printList(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
