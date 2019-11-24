package com.day02;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("thred"+i);
        }

        System.out.println(Thread.currentThread().getName());
    }

}
