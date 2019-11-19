package com.day01;

public class DemoStringBuilder {
    public static void main(String[] args) {
        /**
         * 字符串缓冲区
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mmmp");
        //stringBuilder.insert(2,'3');
        //stringBuilder.delete(1,3);
        String s = stringBuilder.toString();
        System.out.println(s);

    }
}
