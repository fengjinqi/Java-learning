package com.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Users\\admin\\Desktop\\404A9377_1.JPG");
        FileOutputStream fileOutputStream = new FileOutputStream("404A9377_1.JPG");
//        int read;
//        while ((read=fileInputStream.read())!=-1){
//            fileOutputStream.write(read);
//        }
        byte[] bytes =new byte[1024];//读取写入速度快
        int len=0;
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
