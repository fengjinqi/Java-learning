package com.day01;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//win ; lin ;
        String separator = File.separator;
        System.out.println(separator);//win \   lin /
        show();
        show1("c","6.txt");
        show2();
    }
    public static void show(){
        File file = new File("H:\\黑马Java\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\5.txt");
        System.out.println(file);
        File file1 = new File("b.txt");
        System.out.println(file1);
    }
    public static void show1(String parent,String child){
        File file = new File(parent,child);
        System.out.println(file);

    }
    public static void show2(){
        File file = new File("c");
        File file1 = new File(file,"5.txt");
        System.out.println(file1);
    }
}
