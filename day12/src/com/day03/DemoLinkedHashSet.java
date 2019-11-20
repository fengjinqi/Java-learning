package com.day03;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        //无序
        HashSet<String> objects = new HashSet<>();
        objects.add("e");
        objects.add("a");
        objects.add("c");
        System.out.println(objects);
        //有序
        LinkedHashSet<Object> objects1 = new LinkedHashSet<>();
        objects1.add("s");
        objects1.add("b");
        objects1.add("c");
        objects1.add("a");
        System.out.println(objects1);
    }
}
