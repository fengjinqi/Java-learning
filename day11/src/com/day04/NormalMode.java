package com.day04;

import com.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount; i++) {
            if (i == totalCount - 1) {
                list.add(avg+mod);
            } else {
                list.add(avg);
            }
        }
        System.out.println(list.get(totalCount-1));
        return list;
    }
}
