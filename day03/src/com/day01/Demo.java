package com.day01;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
    enum Weekday {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }
    public static void main(String[] args) {
        Date time = new Date();
        System.out.println(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));
        String s = "Hello";
        System.out.println(s.hashCode());
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println( System.identityHashCode(s));
        System.out.println(s);
        s = "mmp";
        System.out.println(s);
        System.out.println( System.identityHashCode(s));
        String n;
        n="45455";
        System.out.println(n.hashCode());
        n="34";
        System.out.println(n.hashCode());

        char z = '在';
        z = 'b';
    }
}
