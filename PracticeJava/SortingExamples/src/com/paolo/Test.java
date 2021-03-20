package com.paolo;

public class Test {
    public static void main(String[] args) {
        int arr[] = {2,5,8,6,33,7,4,3};

        Test sort = new Test();
        sort.hSort(arr);
        sort.print(arr);
    }

    void heapster (int arr[], int heapSize, int root){

        int largest = root;
        int left = 2*root + 1;
        int right = 2*root + 2;

        if (left < heapSize && arr[left] > arr[largest]){
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapster(arr, heapSize, largest);
        }
    }

    void hSort(int arr[]){

        for (int i = (arr.length/2) - 1; i>=0; i--){
            heapster(arr, arr.length, i);
        }

        for (int i=arr.length-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapster(arr, i, 0);
        }
    }

    int partition(int arr[], int start, int end){
        int pivot = arr[end];

        int smallerElement = start - 1;
        for (int currentElement = start; currentElement < end; currentElement++){
            if (arr[currentElement] < pivot){
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

    void qSort(int arr[], int start, int end){
        if (start < end){
            int pi = partition(arr, start, end);
            qSort(arr, start, pi - 1);
            qSort(arr, pi + 1, end);
        }
    }

    void merge(int arr[], int left, int mid, int right){
        int sub1 = mid - left + 1;
        int sub2 = right - mid;

        int L[] = new int[sub1];
        int R[] = new int[sub2];

        for(int i=0; i<sub1; i++){
            L[i] = arr[left + i];
        }

        for (int j=0; j<sub2; j++){
            R[j] = arr[mid + 1 +j];
        }

        int i=0, j=0, key=left;
        while(i<sub1 && j<sub2){
            if(L[i] <= R[j]){
                arr[key] = L[i];
                i++;
            } else {
                arr[key] = R[j];
                j++;
            }
            key++;
        }


        while(i<sub1){
            arr[key] = L[i];
            i++;
            key++;
        }

        while(j<sub2){
            arr[key] = R[j];
            j++;
            key++;
        }
    }

    void mSort(int arr[], int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mSort(arr, left, mid);
            mSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    void insertionSort(int arr[]){
        for (int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void bubbleSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
