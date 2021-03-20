package com.paolo;

public class RunnableThread extends Thread{
    private Thread t;
    private String threadName;

    RunnableThread (String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run(){
        System.out.println("Starting " + threadName);

        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Thread " + threadName + "," +i);
                t.sleep(5000);
            }
        } catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
