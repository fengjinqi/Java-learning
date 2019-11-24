package com.day02;

public class DemoRunnable {
    public static void main(String[] args) {
        //Runnable接口实现多线程
        /**
         * Runnable接口实现了扩展性，可以继承其他接口 继承Thread就不能继承其他类
         */
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();
    }
}
