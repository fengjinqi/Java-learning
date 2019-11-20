package com.day02;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] color = {"♥","♠","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        list.add("大王");
        list.add("小王");
        for (String number : numbers) {
            for (String s : color) {
                list.add(number+s);
            }
        }
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //发牌
            if (i>=51){
                list4.add(list.get(i));
            }else if(i%3==0){
                list1.add(list.get(i));
            }else if(i%3==1){
                list2.add(list.get(i));
            }else if(i%3==2){
                list3.add(list.get(i));
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
