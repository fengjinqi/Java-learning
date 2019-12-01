package com.day01;

import java.util.ArrayList;

public class DemoStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("baaa");
        list.add("aaaa");
        list.add("caaa");
        //函数流
        list.stream().filter((String name)->{
            return name.startsWith("a");
        }).filter(name->name.length()==4).forEach((String name)->{
            System.out.println(name);
        });
    }
}
