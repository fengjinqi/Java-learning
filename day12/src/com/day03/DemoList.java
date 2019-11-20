package com.day03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove(0);
        Iterator<String> iterator = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
