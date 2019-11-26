package com.day05;

import java.io.*;

public class DemoBufferedInputStream {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("FileOutputStream.txt"));

        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
        bufferedInputStream.close();
    }
}
