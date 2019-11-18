package com.day01;

import java.sql.Array;

public class DemoMehods {

    public static void main(String[] args) {
        int number = test(100, 488);
        System.out.println(number);
        System.out.println(add(100));
    }

    public static int test(int a, int b) {
        return a + b;
    }

    public static int add(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
