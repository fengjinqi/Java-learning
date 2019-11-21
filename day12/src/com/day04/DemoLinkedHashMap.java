package com.day04;

import java.util.*;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        //有序
        HashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        stringStringLinkedHashMap.put("a","b");
        stringStringLinkedHashMap.put("d","b");
        stringStringLinkedHashMap.put("c","b");
        stringStringLinkedHashMap.put("b","b");
        Set<Map.Entry<String, String>> entries = stringStringLinkedHashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
