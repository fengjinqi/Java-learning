package com.day01;

import java.util.Calendar;

/**
 * 日历类
 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR)+"-"+(instance.get(Calendar.MONTH)+1)+"-"+instance.get(Calendar.DATE));
        instance.set(9999,9,23);
        instance.add(Calendar.YEAR,2);
        System.out.println(instance.get(Calendar.YEAR));

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
