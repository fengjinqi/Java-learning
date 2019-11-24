package com.day04;

public class DemoWait {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    System.out.println("准备开始");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("已经好了");
                }
            }
        }.start();

       new Thread(){
           @Override
           public void run() {
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (object){
                   System.out.println("5秒后告知");
                   object.notify();
               }
           }
       }.start();
    }
}

