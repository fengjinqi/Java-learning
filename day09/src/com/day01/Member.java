package com.day01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }
    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个
        //随机获取一个集合当中索引
        System.out.println(list.size());
        int i = new Random().nextInt(list.size());
        Integer remove = list.remove(i);
        //拿出已有的
        int money = super.getMoney();
        //再添加
        super.setMoney(money+remove);

    }
}
