package com.day04;

public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}
