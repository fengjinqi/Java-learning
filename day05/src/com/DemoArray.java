package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {
    /**
     * 数据类型[] 数组名称 = new 数据类型[数组长度]
     *
     * @param args
     */
    /**
     * 数组创建
     */
    public static void newArrays() {
        //动态初始化
        int[] arr = new int[3];
        String[] str;
        str = new String[5];
        double[] dou = new double[5];
        System.out.println(arr);
        System.out.println(str);
        System.out.println(dou);
        //静态初始化
        int[] arrA = new int[]{4, 5, 6, 7};
        String[] arrB = new String[]{"ewew", "reer"};
        System.out.println(arrA);
        System.out.println(arrB);
        //静态简略初始
        int[] arrsA = {1, 3, 4, 5};
        String[] arrsB;
        arrsB = new String[]{"54545"};//拆分就不能省略了
        System.out.println(arrsA);
        System.out.println(arrsB);
    }

    /**
     * 获取数组
     */
    public static void getArrays() {
        //静态
        int[] arr = {1, 3, 5};
        System.out.println(arr[2]);
        //动态
        int[] arr1 = new int[3];

        arr1[2] = 766776;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        float[] arr1B = new float[3];
        Array[] arrayC = new Array[5];
        String[] a = new String[5];
        char[] b = new char[1];
        System.out.println("==============");
        System.out.println(arr1B[0]);
        System.out.println(arrayC[0]);
        System.out.println(a[4]);
        System.out.println(b[0]);
        System.out.println("==============");

    }

    //获取个数以及遍历最大值
    public static void getArrayCount() {
        int[] arr = {1, 3, 5, 6, 788765557, 8, 8, 9, 4554450};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            //System.out.print(arr[i]);
        }
        System.out.println(max);
        System.out.println(arr.length);
    }
    //反转
    public static void arrayRevers(){
        int[] arr = {1,43,65,3,76,90};
        for (int min=0,max=arr.length-1;min<max;min++, max--){
            int temp = arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        for (int i:arr
             ) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        newArrays();
        getArrays();
        getArrayCount();
        arrayRevers();
        int[] a = {1,2,4,5};
        System.out.println('-');
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
            System.out.println(a.length);
        }
        System.out.println(Arrays.toString(a));

    }
}
