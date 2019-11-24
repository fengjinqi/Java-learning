package com.day01;

import java.io.File;

public class Demo1File {
    public static void main(String[] args) {
       show();

    }
    public static void show(){
        File file = new File("b.txt");
       // File file = new File("H:\\黑马Java\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(file.getAbsolutePath());//获取绝对路径
        System.out.println(file.getPath());//相对路径
        System.out.println(file.getName());//获取文件名称
        System.out.println(file.length());//获取文件大小字节
        System.out.println(file.exists());//判断文件或目录是否存在
        System.out.println(file.isFile());//判断是否文件
        System.out.println(file.isDirectory());//判断是否目录

    }
}
