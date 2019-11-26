package com.day06;

import java.io.*;

public class DemoOutputStreamWriter {
    public static void main(String[] args) throws IOException {

        writer();
        read();
    }

    private static void read() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        char[] chars=new char[1024];
        int re=0;
        while ((re=inputStreamReader.read(chars))!=-1){
            System.out.println(chars);
        }
    }

    private static void writer() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
        outputStreamWriter.write("你搞");
        outputStreamWriter.close();
    }

}
