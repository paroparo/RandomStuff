package com.paolo;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,6,3,7,9,2};

        SelectionSort s = new SelectionSort();
        s.sSort(arr);
        s.printArray(arr);
    }

    public void sSort(int arr[]){
        for (int i=0; i< arr.length-1;  i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArray(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
