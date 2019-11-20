package com.day03;

public class DemoVarArgs {
    public static void main(String[] args) {
        add("dfd",1,2);
    }
    //可变参数
    //一个方法只能有一个可变参数，
    // 多个参数必须在末尾
    public static void add(String b,int...arr){
        System.out.println(arr.length);
    }
}
