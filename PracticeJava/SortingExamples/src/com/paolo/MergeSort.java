package com.paolo;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,3,6,8,1,9,11,32};

        MergeSort s = new MergeSort();
        s.sort(arr, 0, arr.length-1);
        s.print(arr);

    }

    public void merge(int arr[], int left, int mid, int right){

        int sub1 = mid - left + 1;
        int sub2 = right - mid;

        //Create the subarrays
        int L[] = new int[sub1];
        int R[] = new int[sub2];

        for (int i=0; i<sub1; i++){
            L[i] = arr[left + i];
        }
        for (int j=0; j<sub2; j++){
            R[j] = arr[mid + 1 + j];
        }

        int i=0, j=0, k=left;
        while (i < sub1 && j < sub2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i< sub1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<sub2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int left, int right){
        if (left < right){
            int mid = (left + right)/2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
