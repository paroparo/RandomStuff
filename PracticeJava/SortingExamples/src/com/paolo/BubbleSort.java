package com.paolo;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 11, 6, 4, 10};
        BubbleSort bS = new BubbleSort();
        bS.bubbleSort(arr);
        System.out.println("Sorted array\n");
        bS.printArray(arr);
    }

    public void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]){
        for (int i =0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
