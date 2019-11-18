package com.day01;

public class DemoFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "===");
        }
        int b = 0;
        while (b <= 10) {
            System.out.println("bv" + b);
            b++;
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);

    }

}
