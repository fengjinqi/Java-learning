package com.day02;


import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("6.txt",true);//true为追加写入
        fileOutputStream.write(98);//写入字节流
        byte[] i ={65,43,65,8};
        byte[] b ="你好".getBytes();
        fileOutputStream.write(i);//写入字节流
        fileOutputStream.write(b);//写入字节流
        fileOutputStream.close();
    }
}
