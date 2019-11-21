package com.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("a","b");
        stringStringMap.put("b","b");
        stringStringMap.put("c","b");
        stringStringMap.put("d","b");
        stringStringMap.put("a","b");
        System.out.println(stringStringMap);
        String b=  stringStringMap.remove("a");
        System.out.println(stringStringMap.get("b"));
        System.out.println(stringStringMap.containsKey("a"));//判断是否包含key
        //循环
        Set<String> strings = stringStringMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String i =iterator.next();
            System.out.println(i+stringStringMap.get(i));
        }
        Set<Map.Entry<String, String>> entries = stringStringMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
           // System.out.println(iterator1.next());
            Map.Entry<String, String> next = iterator1.next();
            System.out.println(next.getKey()+"|"+next.getValue());
        }
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
    }
}
