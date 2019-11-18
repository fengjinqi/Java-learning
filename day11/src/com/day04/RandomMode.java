package com.day04;

import com.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        /**
         * 最少1分钱 最多不超过剩下金额平均数的2倍
         *
         */
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int monery = random.nextInt(totalMoney/totalCount*2)+1;
            list.add(monery);
            leftMoney-=monery;
            leftCount--;

        }
        list.add(leftMoney);
        return list;
    }
}
