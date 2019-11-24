package com.day03;

public class DemoTicket {
    public static void main(String[] args) {
        /**
         * 一个方法，三个线程
         */
        RunnableImpl runnable = new RunnableImpl();
        System.out.println(runnable);
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
