package com.day06;

public class DemoCalculatorLamdba {
    public static void main(String[] args) {
        invoked(10, 20, new Calculator() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        });
        /*invoked(100,20,(int a,int b)->{
           return a+b;
        });*/
        invoked(100,20,( a, b)->a+b);
    }
    public static void invoked(int a,int b,Calculator calculator){
        int sum =calculator.method(a,b);
        System.out.println(sum);
    }

}
