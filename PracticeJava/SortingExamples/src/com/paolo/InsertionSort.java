package com.paolo;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {16,12,1,4,3,9};
        InsertionSort iS = new InsertionSort();

        iS.iSort(arr);
        iS.printArray(arr);
    }

    public void iSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    void printArray(int arr[]){
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
