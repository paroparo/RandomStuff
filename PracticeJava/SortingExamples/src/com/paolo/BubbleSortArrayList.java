package com.paolo;

import java.util.ArrayList;

public class BubbleSortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(10);
        arr.add(5);
        arr.add(7);
        arr.add(3);

        for (int i = 0; i < arr.size(); i++){
            for (int j=0; j<arr.size()-i-1; j++){
                if (arr.get(j).compareTo(arr.get(j+1)) > 0 ){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set((j+1), temp);
                }
            }
        }
        System.out.println(arr);
    }
}
