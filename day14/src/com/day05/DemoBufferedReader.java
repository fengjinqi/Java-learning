package com.day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("404A9377_1.JPG"));
        char[]chars=new char[1024];
        int read=0;
        while ((read=bufferedReader.read(chars))!=-1){
            System.out.println(new String(chars,0,read));
        }
        bufferedReader.close();
    }
}
