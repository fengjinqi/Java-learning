package com;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoFIleServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        File file = new File("D:\\Users\\admin\\Desktop\\111");
        if (!file.exists()) file.mkdir();

        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        System.out.println("=============================");
        accept.getOutputStream().write("上传成功".getBytes());
        accept.close();
        fileOutputStream.close();
        serverSocket.close();
    }
}
