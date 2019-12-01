package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DemoFIleUpload {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Users\\admin\\Desktop\\404A9377_1.JPG");
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }

        fileInputStream.close();
        socket.close();
    }
}
