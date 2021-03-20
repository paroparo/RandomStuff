package com.paolo;

public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {2,8,44,1,12,4,6,16};

        HeapSort s = new HeapSort();
        s.sort(arr);
        s.print(arr);
    }

    public void sort(int arr[]){

        //Build the heap
        for (int i = (arr.length / 2) - 1; i >= 0; i--){
            heapster(arr, arr.length, i);
        }
        // One by one extract an element from the heap
        for (int i = arr.length-1; i>=0; i--){
            //Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heap on the reduced heap
            heapster(arr, i, 0);
        }
    }

    //Subtree rooted with node i which is an index of arr[]
    // n = size of the heap
    public void heapster(int arr[], int n, int i){
        int largest = i; //largest as root
        int left = 2*i + 1;
        int right = 2*i + 2;

        //If left is larger than the root
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        //If right is larger than largest so far
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        //If largest is not root
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            //Recursively heapster the affected subtree
            heapster(arr, n, largest);
        }
    }

    public void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
