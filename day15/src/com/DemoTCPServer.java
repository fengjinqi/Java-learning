package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes=new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("收到".getBytes());
        accept.close();
        serverSocket.close();

    }
}
