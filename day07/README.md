#Scanner类、Random类、ArrayList 类
## Scanner类

一个可以解析基本类型和字符串的简单文本扫描器。

```java
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();

```
System.in 系统输入指的是通过键盘录入数据。

## 匿名对象

创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量,是创建对象的简化写法

**new 类名(参数列表)；**

## Random类

用于生成伪随机数

```java
Random r = new Random();
int i = r.nextInt();
import java.util.Random;
 public static void main(String[] args) {
    //2. 创建键盘录入数据的对象 
   Random r = new Random();
 
   for(int i = 0; i < 3; i++){
    //3. 随机生成一个数据 
    int number = r.nextInt(10);
    //4. 输出数据 
    System.out.println("number:"+ number);        
    }       
}

```

## ArrayList类

**ArrayList<E> list = new ArrayList<>();**

java.util.ArrayList 是大小可变的数组的实现，存储在内的数据称为元素。此类提供一些方法来操作内部存储 的元素。 ArrayList 中可不断添加元素，其大小也自动增长。

**常用方法和遍历**

**public boolean add(E e) ：将指定的元素添加到此集合的尾部。**

**public E remove(int index) ：移除此集合中指定位置上的元素。返回被删除的元素。**

 **public E get(int index) ：返回此集合中指定位置上的元素。返回获取的元素。** 
 
 **public int size() ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。**
 





