package com.paolo;

public class TestThread {

    public static void main(String[] args) {
        RunnableDemo thread1 = new RunnableDemo("Thread 1");
        thread1.start();

        RunnableDemo thread2 = new RunnableDemo("Thread 2");
        thread2.start();

        RunnableThread thread3 = new RunnableThread("Thread 3");
        thread3.start();
    }
}
