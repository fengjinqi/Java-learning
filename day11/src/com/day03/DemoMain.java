package com.day03;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.method();

        /**
         * 匿名内部类
         */
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("====");
            }
        };
        myInterface1.method();
    }
}
