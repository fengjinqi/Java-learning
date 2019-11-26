package com.day05;

import java.io.*;

public class DemoBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FileOutputStream.txt"));
        bufferedOutputStream.write("写入数据缓冲".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("FileOutputStream.txt"));

        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
        bufferedInputStream.close();
    }
}
