package com.paolo;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {5,3,10,76,87,1,8};

        QuickSort s = new QuickSort();
        s.sort(arr, 0, arr.length-1);
        s.print(arr);
    }

    public int partition(int arr[], int start, int end){
        int pivot = arr[end];

        int smallerElement = start - 1;
        for (int currentElement = start; currentElement < end; currentElement++ ){
            if (arr[currentElement] <= pivot){
                smallerElement++;

                int temp = arr[smallerElement];
                arr[smallerElement] = arr[currentElement];
                arr[currentElement] = temp;
            }
        }
        int temp = arr[smallerElement + 1];
        arr[smallerElement + 1] = arr[end];
        arr[end] = temp;

        return smallerElement+1;
    }

    void sort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi + 1, high);
        }
    }

    public void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
