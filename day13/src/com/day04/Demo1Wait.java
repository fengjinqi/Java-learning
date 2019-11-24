package com.day04;

public class Demo1Wait {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true)
                    synchronized (object){
                        System.out.println("准备开始1");
                        try {
                            object.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("已经好了1=============");
                    }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true)
                    synchronized (object){
                        System.out.println("准备开始2");
                        try {
                            object.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("已经好了2=============");
                    }
            }
        }.start();
       new Thread(){
           @Override
           public void run() {

               while (true){
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (object){
                       System.out.println("5秒后告知");
                       object.notifyAll();
                   }
               }

           }
       }.start();
    }
}

