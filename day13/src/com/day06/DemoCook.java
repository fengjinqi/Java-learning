package com.day06;

public class DemoCook {
    public static void main(String[] args) {
        nvoke(new Cook() {
            @Override
            public void methd() {
                System.out.println("吃饭了");
            }
        });
        nvoke(()->{
            System.out.println("吃饭了");
        });
    }
    public static void  nvoke(Cook cook){
        cook.methd();
    }
}
