package com.day06;

public class DemoLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        //Lambda
        /**
         * ()参数
         * ->方法体
         * {}重写接口
         */
        new Thread(()->
            System.out.println(Thread.currentThread().getName())
        ).start();
    }
}
