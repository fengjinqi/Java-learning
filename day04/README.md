# 方法的定义和调用
## 定义方法的格式详解

```java
修饰符 返回值类型 方法名(参数列表){
//代码省略...
return 结果;
}
```
修饰符： public static 固定写法
返回值类型： 表示方法运行的结果的数据类型，方法执行后将结果返回到调用者
参数列表：方法在运算过程中的未知数据，调用者调用方法时传递
return：将方法执行后的结果带给调用者，方法执行到 return ，整体方法运行结束

return 结果; 这里的"结果"在开发中，我们正确的叫法成为方法的返回值

需求：定义方法实现两个整数的求和计算。

明确返回值类型：方法计算的是整数的求和，结果也必然是个整数，返回值类型定义为int类型。
明确参数列表：计算哪两个整数的和，并不清楚，但可以确定是整数，参数列表可以定义两个int类型的
变量，由调用者调用方法时传递

```java
public class Method_Demo2 {
    public static void main(String[] args) {
        // 调用方法getSum，传递两个整数，这里传递的实际数据又称为实际参数
        // 并接收方法计算后的结果，返回值
        int sum = getSum(5, 6);
        System.out.println(sum);
    }
    /*
    定义计算两个整数和的方法
    返回值类型，计算结果是int
    参数：不确定数据求和，定义int参数.参数又称为形式参数
    */
    public static int getSum(int a, int b) {
        return a + b;
    }
}
```

程序执行，主方法 main 调用 getSum 方法，传递了实际数据 5和6 ，两个变量 a和b 接收到的就是实际参数，并
将计算后的结果返回，主方法 main 中的变量 sum 接收的就是方法的返回值。


## 定义方法的注意事项

**定义位置，类中方法外面。**
**返回值类型，必须要和 return 语句返回的类型相同，否则编译失败 。**

```java
// 返回值类型要求是int
public static int getSum() {
    return 5;// 正确，int类型
    return 1.2;// 错误，类型不匹配
    return true;// 错误，类型不匹配
}
```
不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。

# 调用方法的三种形式

**直接调用**：直接写方法名调用

```java
public static void main(String[] args) {
    print();
}
public static void print() {
    System.out.println("方法被调用");
}
```
**赋值调用**：调用方法，在方法前面定义变量，接收方法返回值

```java
public static void main(String[] args) {
    int sum = getSum(5,6);
    System.out.println(sum);
}
public static int getSum(int a,int b) {
    return a + b;
}
```
**输出语句调用**：
  在输出语句中调用方法， System.out.println(方法名()) 。
 ```java
public static void main(String[] args) {
    System.out.println(getSum(5,6));
}
public static int getSum(int a,int b) {
    return a + b;
}
```
**不能用输出语句调用 void 类型的方法。因为方法执行后没有结果，也就打印不出任何内容。**

#方法重载

**方法重载：**

指在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可，与修饰符和返
回值类型无关。

**参数列表：**

个数不同，数据类型不同，顺序不同。


**重载方法调用：**

JVM通过方法的参数列表，调用不同的方法。























