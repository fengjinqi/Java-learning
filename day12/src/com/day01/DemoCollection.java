package com.day01;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> collection =new ArrayList<String>();
        System.out.println(collection);
        collection.size();
        collection.add("errerer");
        collection.add("sdsds");
        collection.add("mmp");
        collection.add("d");
        ((ArrayList<String>) collection).add(0,"3");
        System.out.println(collection);
        ((ArrayList<String>) collection).remove(1);
        collection.remove("mmp");//删除
        System.out.println(collection);
        System.out.println(collection.contains("d"));//判断是否包含
        System.out.println(collection.isEmpty());//判断集合是否为空
        System.out.println(collection.size());
        System.out.println(collection.toArray());//转数组
        collection.clear();//清空
        System.out.println(collection);
        System.out.println(collection.isEmpty());
    }
}
