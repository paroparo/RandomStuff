package com.paolo;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Enumeration names;
        String key;

        Hashtable<String, String> hashTable = new Hashtable<String, String>();

        hashTable.put("The National", "You had your soul with you");
        hashTable.put("The National", "Mr. November");
        hashTable.put("Foo Fighters", "Everlong");

        System.out.println(hashTable);

    }
}
