package com.day01;

public class DemoMain {
    public static void main(String[] args) {
        DemoInnerClass demoInnerClass = new DemoInnerClass();
        demoInnerClass.methods();
        DemoInnerClass.DemoChilderClass DemoInnerClass = new DemoInnerClass().new DemoChilderClass();
        DemoInnerClass.childer();
    }
}
