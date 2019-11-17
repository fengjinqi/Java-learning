package com.day05;

public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();
        myInterfaceAbstract.methods();
        myInterfaceAbstract.modethodDefault();
        MyInterfaceAbstract.methodStatic();
        System.out.println(MyInterfaceAbstract.NUM);
    }
}
