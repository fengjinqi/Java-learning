package com.day03;

import java.util.LinkedList;

public class DemoLinkdList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.addFirst("v");//第一个插入
        list.push("43");//第一个插入
        list.addLast("54");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        boolean n = list.isEmpty();
        list.remove();
        list.removeFirst();
        System.out.println(list);

    }
}
