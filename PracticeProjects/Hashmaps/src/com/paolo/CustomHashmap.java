package com.paolo;

public class CustomHashmap<K, V> {
    // Default capacity
    private int capacity = 16;

    // Initialize Entry
    private Entry<K, V>[] table;

    // Instantiate when no capacity is given
    public CustomHashmap(){
        table = new Entry[capacity];
    }

    // Instantiate given a capacity
    public CustomHashmap(int capacity){
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    // Adding value
    public void put(K key, V value){
        int index = index(key);
        Entry newEntry = new Entry(key, value, null);
        if(table[index] == null){
            table[index] = newEntry;
        } else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = table[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null){
                previousNode.setNext(newEntry);
            }
        }
    }

    public V get(K key){
        V value = null;
        int index = index(key);
        Entry<K, V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    private int index(K key) {
        if (key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }

}
