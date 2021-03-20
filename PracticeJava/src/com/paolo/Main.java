package com.paolo;

public class Main {

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        list.printList(head);

        Node reverseHead = list.reverseListRecursive(head,null);
        System.out.println("\n");
        list.printList(reverseHead);

    }

    public static Node head;

    public static class Node {
        Node (int d){
            int data = d;
            Node next = null;
        }
    }

    public Node reverseLinkedListRecursive(Node curr, Node prev){
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
}
