package com.day01;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception{
        DataFormat dataFormat = new DataFormat();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
        System.out.println(System.currentTimeMillis());
        new Demo().method();
    }
    public  void method() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date str = simpleDateFormat.parse("2019-11-19 20:04:26");//文本转格式
        System.out.println(str);
    }
}
