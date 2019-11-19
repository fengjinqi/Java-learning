package com.day01;

public class DemoInter {
    public static void main(String[] args) {
        Integer integer = new Integer(1);//装箱
        System.out.println(integer);
        System.out.println(Integer.valueOf("1"));
        int i = integer.intValue();//拆箱

        System.out.println(Integer.toString(100)+200);
        System.out.println(String.valueOf(100)+200);
        System.out.println(Integer.parseInt("100")+2);
    }
}
