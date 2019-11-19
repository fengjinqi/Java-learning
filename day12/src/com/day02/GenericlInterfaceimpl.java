package com.day02;

public class GenericlInterfaceimpl implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
