package com.day04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
    public static void main(String[] args) throws IOException {
        show();
        Properties properties = new Properties();
        properties.setProperty("都不方便","nnn");
        properties.setProperty("夺宝奇兵","nnn");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("1.txt");
            properties.store(fileWriter,"saaave");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void show() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("1.txt"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"=========="+properties.getProperty(string));
        }
    }
}
