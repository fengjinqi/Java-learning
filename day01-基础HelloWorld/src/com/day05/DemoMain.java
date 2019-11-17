package com.day05;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USB mouse = new Mouse();//多态
        computer.usbDevice(mouse);
        Keyboard keyboard = new Keyboard();
        computer.usbDevice(keyboard);
        computer.powerOff();
    }
}
