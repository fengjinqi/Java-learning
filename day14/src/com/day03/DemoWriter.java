package com.day03;

import java.io.FileWriter;

import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args){


        show();
        try ( FileWriter filterWriter = new FileWriter("c.txt",true)){
            filterWriter.write(87);
            char[] chars ={'a','b','c','d'};
            filterWriter.flush();
            filterWriter.write(chars,1,2);//写入字符数组从第1写入总共写入两个字符
            filterWriter.write("大兵保镖");

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void show(){
        FileWriter filterWriter=null;
        try {
             filterWriter = new FileWriter("c.txt",true);
            filterWriter.write(87);
            char[] chars ={'a','b','c','d'};
            filterWriter.flush();
            filterWriter.write(chars,1,2);//写入字符数组从第1写入总共写入两个字符
            filterWriter.write("大兵保镖");
            //filterWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if (filterWriter!=null)
            try {
                filterWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
