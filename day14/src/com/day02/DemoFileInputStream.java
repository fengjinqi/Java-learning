package com.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoFileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Users\\admin\\Desktop\\Java-learning\\day14\\6.txt");
        int read;
        while ((read=fileInputStream.read())!=-1){
            System.out.println(((byte)read));
        }

        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(bytes);
        }

        fileInputStream.close();
    }
}
