package com.day03;

import java.util.Scanner;

public class DemoScanner {
    /**
     * 获取键盘输入的一个int数字 int num = sc.nextInt()
     * 获取键盘输入的一个i字符串 String num = sc.next()
     * @param args
     */
    // TODO new Scanner(System.in) 匿名类
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // next方式接收字符串
        System.out.println("next方式接收：");
        System.out.println(scan.hasNext());
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
