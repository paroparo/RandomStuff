package com.paolo;

import java.util.ArrayList;

public class InsertionSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(3);
        aList.add(18);
        aList.add(1);
        aList.add(5);
        aList.add(9);
        aList.add(6);
        for (int i = 0; i < aList.size(); i++){
            int key = aList.get(i);
            int j = i - 1;

            while(j >= 0 && (aList.get(j) > key)){
                aList.set(j+1, aList.get(j));
                j = j -1;
            }
            aList.set((j+1), key);
        }
        System.out.println(aList);
    }
}
