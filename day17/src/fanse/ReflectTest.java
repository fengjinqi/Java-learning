package fanse;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Properties properties = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();//获取当前class字节对象
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");//根据当前字节对象获取文件

        properties.load(resourceAsStream);//读取配置文件
        String className = properties.getProperty("className");//获取配置文件name
        String methodName = properties.getProperty("methodName");
        //加载类进内存
        Class<?> aClass = Class.forName(className);
        System.out.println(methodName);
        //创建对象
        Object o = aClass.newInstance();
        System.out.println(aClass.getMethod(methodName));
        //获取方法
        Method method = aClass.getMethod(methodName);
        //执行方法
        method.invoke(o);
    }
}


