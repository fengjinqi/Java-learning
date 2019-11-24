package com.day06;

import java.util.Arrays;
import java.util.Comparator;

public class DemoLambdaArray {
    public static void main(String[] args) {

        Person[] arr = {
                new Person("都不方便",23),
                new Person("都不方便1",24),
                new Person("都不方便2",33),
        };
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });*/
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o2.getAge()-o1.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
