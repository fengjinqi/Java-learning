package com.day01;

public class MyFunInterface  {
    public static void  start(Runnable run){
        new Thread(run).start();
    }
    public static void main(String[] args) {
        start(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+'-');
            }
        });
    }
}
