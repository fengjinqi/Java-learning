package zhujie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@DemoPro(className = "zhujie.DemoAnno",methodName = "get")
public class ReflectTest {
    public static void main(String[] args) throws  ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        DemoPro annotation = reflectTestClass.getAnnotation(DemoPro.class);//获取当前字节类的注解
        String s = annotation.className();
        System.out.println(s);
        String s1 = annotation.methodName();
        System.out.println(s1);
        Class<?> aClass = Class.forName(s);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(s1);
        method.invoke(o);

    }
}


