package com.paolo;

import java.util.Iterator;
import java.util.LinkedList;

public class Try {
    public static void main(String[] args) {
        LinkedList origList = new LinkedList();

        origList.add(1);
        origList.add(2);
        origList.add(3);
        Iterator<Integer> iter_origList = origList.iterator();
        while (iter_origList.hasNext()){
            System.out.println(iter_origList.next());
        }

//        Try.printer(head);
        System.out.println("\n");
        Node reversed = reverseIterative(head);
        Try.printer(reversed);
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

    public static Node reverseRecursive(Node curr, Node prev){
        if (curr.next == null){
            head = curr;
            curr.next = prev;
            return head;
        }

        Node next1 = curr.next;
        curr.next = prev;
        reverseRecursive(next1, curr);
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

    public static void printer(Node node) {
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }
}
