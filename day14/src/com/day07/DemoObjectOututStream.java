package com.day07;

import com.Student;

import java.io.*;

public class DemoObjectOututStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
        Student student = new Student("不知道",23);
        objectOutputStream.writeObject(student);

        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
        Object object = objectInputStream.readObject();
        System.out.println(object);
        objectInputStream.close();
    }
}
