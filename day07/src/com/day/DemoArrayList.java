package com.day;

import com.day01.Student;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList {
    public static void demo() {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //添加元素 有返回值 boolean
        boolean is_Type = list.add("45");
        list.add("56");
        System.out.println(list);
        //从集合获取元素，索引开始 返回值类型与泛型一致
        String name = list.get(0);
        System.out.println(list.get(0));
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println("====" + list.get(i) + "===");
        }
        //删除
        String whoRemove = list.remove(0);
        System.out.println(whoRemove);
        System.out.println(list);
        //获取集合个数类似数组length
        System.out.println(list.size());
    }

    /**
     * 存储基本数据类型
     * 本身不支持基本数据类型必须使用包装类
     * byte   Byte
     * short  Short
     * int    Integer
     * long   Long
     * float  Float
     * double  Double
     * char   Character
     * boolean  Boolean
     */
    public static void demoBasic() {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isType = list.add(43);
        int name = list.get(0);

        System.out.println(list);
    }

    public static void main(String[] args) {
        demo();
        demoBasic();
        demoRandom(20, 56);
        demoListStuden();

    }

    /**
     * 练习
     * 6~33随机数 添加集合
     */
    public static void demoRandom(int size, int length) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= size; i++) {
            int namber = random.nextInt(length) + 1;
            list.add(namber);
        }

        System.out.println(list);
        printArrayList(list);
        arrayListReturn(list);
    }

    /**
     * 对象添加集合
     */
    public static void demoListStuden() {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("mmp", 230);
        Student two = new Student("东方不败", 2300);
        Student three = new Student("夺宝奇兵", 30);
        Student four = new Student("独孤求败", 90);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAge() + "===" + list.get(i).getName());
        }
    }

    /**
     * 接收数据集合作为参数
     */
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(n + "}");
            } else {
                System.out.print(n + "@");
            }
        }
    }

    public static void arrayListReturn(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(list1);
    }
}
