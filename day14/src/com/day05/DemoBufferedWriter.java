package com.day05;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("writer.txt"));
        bufferedWriter.write("hahahh");
        bufferedWriter.newLine();//换行
        bufferedWriter.write("hahahh");
        bufferedWriter.close();

    }
}
