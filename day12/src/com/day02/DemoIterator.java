package com.day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        //迭代器
        Collection<String> collection = new ArrayList<>();
        collection.add("东方不败");
        collection.add("独孤求虐");
        collection.add("独孤求败");
        collection.add("打广告标题");
        collection.add("西门吹雪");
        collection.add("你猜我是谁");
        collection.add("我是你大爷");
        Iterator<String> iterator = collection.iterator();
        boolean b = iterator.hasNext();
        System.out.println(b);
        String next = iterator.next();
        System.out.println(next);
        //====================================
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //================================
        for (String i:collection
             ) {
            System.out.println(i);
        }
    }
}
