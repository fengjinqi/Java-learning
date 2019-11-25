package com.day03;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("6.txt");

        char[] chars =new char[1024];//读取写入速度快
        int len=0;
        while ((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars));
        }
        fileReader.close();
    }
}
