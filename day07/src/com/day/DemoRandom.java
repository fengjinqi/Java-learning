package com.day;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    /**
     * 猜数字游戏
     */
    public static void RandomGame(){
        Random r = new Random();
       int randonNumber= r.nextInt(100)+1;
        System.out.println("开始竞猜:=============");
        Scanner s = new Scanner(System.in);
        while (true){
            if(s.hasNextInt()){
                int getNumber = s.nextInt();
                if(randonNumber>getNumber){
                    System.out.println("猜小了,请重试");
                }else if(randonNumber<getNumber){
                    System.out.println("猜大了,请重试");
                }else{
                    System.out.println("ok");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        //默认0~19 所以整体加一
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(20)+1);
        }
        RandomGame();
    }
}
