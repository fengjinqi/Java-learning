package com.day01;

import java.io.FileNotFoundException;

public class DemoTry {
    public static void main(String[] args) {
        try {
            readFiled("43");
        }catch (Exception as){
            System.out.println("434343"+as);
            System.out.println(as.getMessage());
            System.out.println(as.toString());

            as.printStackTrace();
        }finally {
            System.out.println("释放资源");
        }
    }
    public static void readFiled(String filename) throws FileNotFoundException {
        if(!filename.equals("344")){
            throw new FileNotFoundException("文件不对");
        }
    }
}
