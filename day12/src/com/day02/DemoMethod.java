package com.day02;

import java.util.ArrayList;

public class DemoMethod {
    /**
     * 泛型方法
     * @param m
     * @param <T>
     */
    public <T> void method(T m){
        System.out.println(m);
    }

    /**
     * 静态泛型
     * @param m
     * @param <M>
     */
    public static <M> void method1(M m){
        System.out.println(m);
    }
    public static void main(String[] args) {
        DemoMethod demoMethod = new DemoMethod();
        demoMethod.method("4");
        demoMethod.method(34);
        demoMethod.method('5');
        DemoMethod.method1('3');
        //泛型接口
        GenericlInterfaceimpl genericlInterfaceimpl = new GenericlInterfaceimpl();
        genericlInterfaceimpl.method("5454");
        //类泛型接口
        GenericlInterfaceimpl2<Integer> objectGenericlInterfaceimpl2 = new GenericlInterfaceimpl2<>();
        objectGenericlInterfaceimpl2.method(544444444);
        ArrayList<String> list = new ArrayList<>();
        list.add("3");
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(1);
        print(list);
        print(list2);
    }

    /**
     * 泛型通配符
     * @param list
     */
    private static void print(ArrayList<?> list){
        System.out.println(list);

    }
}
