package com.day02;

public class GenericlInterfaceimpl2<E> implements GenericInterface<E> {
    @Override
    public void method(E s) {
        System.out.println(s);
    }
}
