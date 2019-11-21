package com.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollections
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","a","d","z");
        System.out.println(list);
        Collections.shuffle(list);//打乱集合
        System.out.println(list);//
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Person> list1 = new ArrayList<>();
        Collections.addAll(list1,new Person("哈",12));
        Collections.addAll(list1,new Person("哈4",15));
        Collections.addAll(list1,new Person("哈1",11));
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(list1);
    }
}
