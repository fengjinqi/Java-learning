package com.day01;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(String name, int money) {
        super(name, money);
    }

    public Manager() {
    }

    /**
     *
     * @param totalMoney 要发送的钱
     * @param count 发送个数
     * @return
     */
    public ArrayList<Integer> send(int totalMoney,int count){
        //粗存钱
        ArrayList<Integer> list = new ArrayList<>();
        //查看群主余额
        int leftMoney =super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return list;
        }
        //扣钱
        super.setMoney(leftMoney-totalMoney);
        //发红包平均
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count; i++) {

            if (i==count-1){
                //System.out.println(avg+"==="+mod);
                list.add(avg+mod);
            }else {
                list.add(avg);
            }
        }
     /*   for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }*/
        //最后一个红包
        int last= avg+mod;

        return list ;
    }
}
