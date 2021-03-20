package com.paolo;

public class ReverseString {

    public static void main(String[] args) {
        String input = "TestThisPaolo";

        char[] rts = input.toCharArray();

        for (int i=rts.length-1; i>=0; i--){
            System.out.print(rts[i]);
        }
    }
}
