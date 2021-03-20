package com.paolo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(7) + 1;
        System.out.println(randomNumber);
    }
}
