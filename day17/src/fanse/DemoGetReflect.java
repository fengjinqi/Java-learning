package fanse;

import java.lang.reflect.Field;

public class DemoGetReflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();//获取所有public变量地址

        for (Field field : fields) {
            System.out.println(field);
        }
        Field pub = personClass.getField("pub");
        System.out.println(pub);//获取指定public变量地址
        Person person = new Person();
        pub.set(person,"张三");//设置值
        System.out.println(pub.get(person));//获取值

        Field[] declaredFields = personClass.getDeclaredFields();//获取所有成员变量地址
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field nmae = personClass.getDeclaredField("nmae");//默认不能获取私有变量值
        nmae.setAccessible(true);//暴力反射，不报错能访问私有变量值
        System.out.println(nmae.get(person));

    }
}
