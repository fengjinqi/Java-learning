package com.day01;

import java.util.ArrayList;

public class MainRed {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member managerA = new Member("成员A",0);
        Member managerB = new Member("成员B",0);
        Member managerC = new Member("成员C",0);
        manager.show();
        managerA.show();
        managerB.show();
        managerC.show();
        System.out.println("++++++++++++++++++");
        ArrayList<Integer> send = manager.send(20, 3);
        managerA.receive(send);
        managerB.receive(send);
        managerC.receive(send);
        manager.show();
        managerA.show();
        managerB.show();
        managerC.show();
    }
}
