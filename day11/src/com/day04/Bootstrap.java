package com.day04;
import com.red.RedPacketFrame;

import java.util.Random;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("晓晓");
        myRed.setOwnerName("晓晓");
        NormalMode normalMode = new NormalMode();
        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);
        Random random = new Random();
        for (int i = 0; i <2 ; i++) {
            System.out.println(random.nextInt(10/3*2)+1);
        }

    }
}
