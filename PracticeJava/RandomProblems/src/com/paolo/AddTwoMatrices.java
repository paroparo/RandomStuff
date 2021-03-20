package com.paolo;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int a[][] = {
                {2,4,2},
                {6,3,1},
                {2,3,8}
        };
        int b[][] = {
                {2,5,3},
                {7,4,2},
                {1,2,4}
        };

        int c[][] = new int[3][3];

        for (int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
