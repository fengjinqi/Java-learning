package fanse;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoGetMethodReflect {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
     /*   Method[] methods = personClass.getMethods();//获取所有方法
        for (Method method : methods) {
            System.out.println(method);
        }*/
        Method eat = personClass.getMethod("eat");
        System.out.println(eat);
        Person person = new Person();
        eat.invoke(person);//执行方法
        Method string = personClass.getMethod("string", String.class);
        string.invoke(person,"54");//执行传参方法

        System.out.println(Person.class.getName());
    }
}
