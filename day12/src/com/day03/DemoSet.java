package com.day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void method(){
        Set<Integer> list = new HashSet<>();
        list.add(3);
        list.add(4);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        boolean b = iterator.hasNext();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer s : list) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
      method();
        HashSet<String> objects = new HashSet<>();
        String string = new String("bc");
        String string1 = new String("bc");
        objects.add(string);
        objects.add(string1);
        objects.add("终端");
        objects.add("hh");
        objects.add("bc");
        System.out.println(objects);
        Person person1 = new Person("abc",45);
        Person person2 = new Person("abc",45);
        Person person3 = new Person("abc",45);
        HashSet<Person> objects1 = new HashSet<>();
        objects1.add(person1);
        objects1.add(person2);
        objects1.add(person3);
        System.out.println(objects1);
    }
}
