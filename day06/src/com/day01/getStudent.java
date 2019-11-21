package com.day01;

public class getStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        s.setAge(20);
        System.out.println(s.getAge());
        Student student = new Student("东方不败",26);
    }


}
