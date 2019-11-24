package com.day01;

import java.io.File;
import java.io.IOException;

public class Demo2File {
    public static void main(String[] args) {
        show();
        show1();
        show2();
        show3();

    }
    public static void show()  {
        File file = new File("D:\\Users\\admin\\Desktop\\Java-learning\\day14\\b.txt");
        try {
            boolean newFile = file.createNewFile();//必须存在目录/创建了文件不会再次创建
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show1(){
        File file = new File("D:\\Users\\admin\\Desktop\\Java-learning\\day14\\b\\5\\9");
        boolean mkdir = file.mkdir();//只能创建文件夹 单级 已存在则不能重新创建
        System.out.println(mkdir);
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);//多级
    }
    public static void show2(){
        File file = new File("b.txt");
        boolean delete = file.delete();//直接删除
        System.out.println(delete+"65");
    }
    public static void show3(){
        File file = new File("D:\\Users\\admin\\Desktop\\Java-learning\\day14");
        String[] list = file.list();//返回当前目录下所有文件夹或者目录
        //不能遍历文件 必须文件夹存在 否则返回空指针异常
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file.listFiles();//file对象
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
