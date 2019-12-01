package fanse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DemoGetGouZaoReflect {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);//获取构造地址
        System.out.println(constructor);
        Person person = constructor.newInstance("张三", 34);//创建构造函数
        System.out.println(person);

        Person person1 = personClass.newInstance();//可以直接获取
        System.out.println(person1);
    }
}
