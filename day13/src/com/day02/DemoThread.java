package com.day02;

public class DemoThread {
    /**
     * 一个程序最少有一个进程，一个进程包含多个线程
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread("rnnn");//构造函数设置线程名字
        //myThread.setName("哈哈");//设置线程名称
       System.out.println(myThread.getName());//获取线程名称
        myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

    }
}
