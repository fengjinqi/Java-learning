package com.day01;

import javax.xml.bind.ValidationException;
import java.io.FileNotFoundException;

public class DemoThrows {
    public static void main(String[] args) throws FileNotFoundException {
        int[] b=null;
        getElement(b,1);
        readFiled("54");
    }
    public  static int getElement(int[] arr,int index) {
        if(arr==null){
            throw new NullPointerException("传递的值为null");
        }
        System.out.println(arr==null);
        int ele = arr[index];
        System.out.println(ele);
        return ele;
    }

    public static void readFiled(String filename) throws FileNotFoundException {
        if(!filename.equals("344")){
            throw new FileNotFoundException("文件不对");
        }
    }
}
