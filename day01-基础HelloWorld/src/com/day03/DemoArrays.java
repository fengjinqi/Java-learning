package com.day03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int[] array = {10,43,56,84,5,2};
        String s = Arrays.toString(array);
        System.out.println(s);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String str = "dshfkjjjjjjjjjjjjjjjjjjrzkxhf";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}
