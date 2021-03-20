package com.paolo;

import java.util.ArrayList;

public class SelectionSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(1);
        for (int i = 0; i < list.size(); i++){
            int minIndex = i;
            for (int j = i+1; j < list.size(); j++){
                if (list.get(j).compareTo(list.get(minIndex)) < 0){
                    minIndex = j;
                }
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
        System.out.println(list);
    }
}
