#环境搭建
1、先去官网下载jdk，访问地址https://www.oracle.com/technetwork/java/javase/downloads/index.html

2、安装傻瓜式安装，注意：安装路径别乱搞，等会要配置环境变量的

3、环境变量：
    ![](https://www.fengjinqi.com/upload/blogimg/image809.png)
然后点击环境变量后在系统变量里面新建
![](https://www.fengjinqi.com/upload/blogimg/image292.png)
注意：变量值为你安装Java的目录
然后在创建ClASS_PATH
![](https://www.fengjinqi.com/upload/blogimg/image844.png)
最后再path里面新增
![](https://www.fengjinqi.com/upload/blogimg/image445.png)
然后点击确定，
最后检查
输入dos命令java
![](https://www.fengjinqi.com/upload/blogimg/image523.png)
出现以下图则说明安装成功
跟着我一步一步安装的一般会正常的，有问题，可私下联系我
ok，现在环境搭建好了，那么我们来写一个HelloWorld
工欲善其事必先利器，我采用的是ied编辑器，具体你们采用何种，随意，记事本都可以的
下面来先写代码
```java
package com.day01;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

```
然后编译运行
dos命令可以直接 javac HelloWorld.java
你会发现下面多了一个class文件，这是因为Java是强类型语言，必须要先编译然后才运行，
ok，现在我们第一个程序写好了，
未完待续，期待下一章

===================
# 常量
指在Java程序中固定不变的值
	
  |  类型 | 含义  |  数据举例 |
  | ------------ | ------------ | ------------ |
  |  整数常量 |  所有的整数 | 0，1，45，8，-5  |
  |  小数常量 | 所有的小数  | 1.4，-4.9，0.0  |
  |  字符常量 |  单引号引起来的，只能写一个字符，必须有内容 | 'a'，'好'  |
  |  字符串常量 | 双引号引起来的，可以写多个，可以不写  |"aaaaaaaaa"   |
  |  布尔常量 | 两个值  | true，false  |
  |  空常量 |  一个值 |  null |
  
  列：
```java
        System.out.println(5);
        System.out.println(5.0);
        System.out.println('5');
        System.out.println("admin);
```
# 变量和数据类型
## 数据类型：
java数据类型分两大类：
### 基本数据类型

整数、浮点数、字符、布尔
	
### 引用数据类型

类、数组、接口
   
### 基本数据类型

四类八种
    
| 数据类型  | 关键字  | 内存占用  | 取值范围  |
| ------------ | ------------ | ------------ | ------------ |
| 字节型  |  byte | 1个字节  | -128~127  |
| 短正型  |  short | 2个字节  |-32768~32767   |
| 整型  | int  | 4个字节(默认)  | -231次方~2的31次方-1 |
|  长整型 | long  |  8个字节 |  -2的63次方~2的63次方-1 |
| 单精度浮点数  |  flaot |  4个字节 |  1.4013E-45~3.4028E+38 |
|  双精度浮点数 | double  | 8个字节(默认)  | 4.9E-324~1.7977E+308  |
| 字符  |  char |  2个字节 | 0-65535  |
|  布尔 |boolean   |  1个字节 | true，false  |

### 变量的基本定义

变量定义的格式包括三个要素： 数据类型 、 变量名 、 数据值 。
#### 格式数据类型 变量名 = 数据值; 

列：
```java
public class Demo{
    public static void main(String[] args){ 
        //定义字节型变量 
        byte b = 100; 
        System.out.println(b); 
        // 定义短整型变量 
        short s = 1000; 
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i); 
        //定义长整型变量
        long l = 12345678900L; 
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 5.5F; 
        System.out.println(f);
       // 定义双精度浮点型变量
        double d = 8.5; 
        System.out.println(d); 
        //定义布尔型变量
        boolean bool = false; 
        System.out.println(bool); 
        //定义字符型变量
         char c = 'A'; 
         System.out.println(c);
    }
}
```
#### long类型建议数据后面加L; float类型后面加F


上一节我们了解了 **常量** 和**变量**以及**基本数据类型**，现在这一章我们来聊聊**数据类型转换**、**运算符**

## 数据类型转换

###自动转化

 将取值范围小的类型自动提升为取值范围大的类型
 
一个int类型与byte字节类型想加运算是int类型
```java
    public static void main(String[] args){
        int i = 1;
        byte b = 2;
        // byte x = b + i; // 报错 
        // int类型和byte类型运算，结果是int类型 
        int j = b + i; 
        System.out.println(j);
    }
```
同样道理，当一个 int 类型变量和一个 double 变量运算时， int 类型将会自动提升为 double 类型进行运算。
 ```java
 public static void main(String[] args) {
    int i = 1; 
    double d = 2.5; 
    //int类型和double类型运算，结果是double类型 
    // int类型会提升为double类型
    double e = d+i;
    System.out.println(e);
 } 

```
#### 转换规则

范围小的类型向范围大的类型提升，byte、short、char 运算时直接提升为 int 。 
```java
 byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double
```
###强制转换

将 1.5 赋值到 int 类型变量会发生什么？产生编译失败，肯定无法赋值。
```java
int i = 1.5; // 错误 double 类型内存8个字节， int 类型内存4个字节。 1.5 是 double 类型，取值范围大于 int 。可以理解为 double 是8 升的水壶， int 是4升的水壶，不能把大水壶中的水直接放进小水壶去。 想要赋值成功，只有通过强制类型转换，将 double 类型强制转换成 int 类型才能赋值。 强制类型转换：将 取值范围大的类型 强制转换成 取值范围小的类型 。 比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。

``` 
####转换格式： 数据类型 变量名 = （数据类型）被转数据值；
```java
int i = (int) 1.5
```
同样道理，当一个 short 类型与 1 相加，我们知道会类型提升，但是还想给结果赋值给short类型变量，就需要强制转换。

 ```java
 public static void main(String[] args) { 
    //short类型变量，内存中2个字节 short s = 1;
    /*出现编译失败 s和1做运算的时候，1是int类型，s会被提升为int类型 s+1后的结果是int类型，将结果在赋值会short类型时发生错误 short内存2个字节，int类型4个字节 必须将int强制转成short才能完成赋值 */
    s = s + 1;//编译失败 
    s = (short)(s+1);//编译成功 
}
```

#####强烈注意 浮点转成整数，直接取消小数点，可能造成数据损失精度。 int 强制转成 short 砍掉2个字节，可能造成数据丢失。

```java
 // 定义s为short范围内最大值 
 short s = 32767; 
 // 运算后，强制转换，砍掉2个字节后会出现不确定的结果 
 s = (short)(s + 10);
```

##ASCII编码表

```java
public static void main(String[] args) { 
    //字符类型变量 
    char c = 'a'; int i = 1; 
    //字符类型和int类型计算 
    System.out.println(c+i);//输出结果是98 
}
```

|  字符 |  数值 |
| ------------ | ------------ |
| 0  | 48  |
| 9  | 57  |
|  A |  65 |
|  Z | 90  |
|  a | 97  |
|  z |  122 |

**在char类型和int类型计算的过程中，char类型的字符先查询编码表，得到97，再和1求和，结果为98。char类型提升 为了int类型。char类型内存2个字节，int类型内存4个字节。**

##运算符

###算数运算符

|  算数运算符包括： |   |
| ------------ | ------------ |
| +  | 加法运算，字符串连接运算  |
| -  | 减法运算  |
|  * |  乘法运算 |
|  / | 除法运算  |
|  % | 取模运算，两个数字相除取余数  |
|  ++、-- |  自增自减运算 |

Java中，整数使用以上运算符，无论怎么计算，也不会得到小数。

```java
public static void main(String[] args) { 
    int i = 1234;
    System.out.println(i/1000*1000);//计算结果是1000
}
```


++ 运算，变量自己增长1。反之， -- 运算，变量自己减少1，用法与 ++ 一致。 独立运算： 变量在独立运算时， 前++ 和 后++ 没有区别 。 变量 前++ ：例如 ++i 。 变量 后++ ：例如 i++ 。

混合运算： 和其他变量放在一起， 前++ 和 后++ 就产生了不同。 变量 前++ ：变量a自己加1，将加1后的结果赋值给b，也就是说a先计算。a和b的结果都是2。 变量 后++ ：变量a先把自己的值1，赋值给变量b，此时变量b的值就是1，变量a自己再加1。a的结果是2，b 的结果是1。 + 符号在字符串中的操作： + 符号在遇到字符串的时候，表示连接、拼接的含义。 "a"+"b"的结果是“ab”，连接含义 2.2 赋值运算符 赋值运算符，就是将符号右边的值，赋给左边的变量。 
```java
比较运算符
  public static void main(String[] args) { 
    int a = 1;
    int b = ++a;
    System.out.println(a);//计算结果是2 
    System.out.println(b);//计算结果是2
}
public static void main(String[] args) { 
    int a = 1; 
    int b = a++;
    System.out.println(a);//计算结果是2 
    System.out.println(b);//计算结果是1 
}
public static void main(String[] args){ 
    System.out.println("5+5="+5+5);//输出5+5=55 
    }
```
### 赋值运算符

|  赋值运算符包括： |   |
| ------------ | ------------ |
| =  | 等于号 |
| +=  | 加等于  |
|  -= |  减等于 |
|  *= | 乘等于  |
|  %= | 取模等  |
|  /= |  除等于 |

赋值运算符，就是将符号右边的值，赋给左边的变量。
 
 比较运算符
 ```java
 public static void main(String[] args){ 
    int i = 5; 
    i+=5;//计算方式 i=i+5 变量i先加5，再赋值变量i 
    System.out.println(i); //输出结果是10
}
```
###比较运算符

|  比较运算符包括： |   |
| ------------ | ------------ |
| ==  | 比较符号两边数据是否相等，相等结果是true。 |
| >  | 比较符号左边的数据是否大于右边的数据，如果大于结果是true。  |
|  < |  比较符号左边的数据是否小于右边的数据，如果小于结果是true。 |
|  >= | 比较符号左边的数据是否大于或者等于右边的数据，如果小于结果是true。  |
|  <= | 比较符号左边的数据是否小于或者等于右边的数据，如果小于结果是true。  |
|  != |  不等于符号 ，如果符号两边的数据不相等，结果是true。 |

比较运算符，是两个数据之间进行比较的运算，运算结果都是布尔值 true 或者 false 。

```java
public static void main(String[] args) { 
    System.out.println(1==1);//true 
    System.out.println(1<2);//true 
    System.out.println(3>4);//false 
    System.out.println(3<=4);//true 
    System.out.println(3>=4);//false 
    System.out.println(3!=4);//true 
}
```
###逻辑运算符

|  逻辑运算符包括： |   |
| ------------ | ------------ |
| && 短路与 |1. 两边都是true，结果是true 2. 一边是false，结果是false 短路特点：符号左边是false，右边不再运算 |
|  ！ 取反 |  1. ! true 结果是false 2. ! false结果是true |
|  短路或 (两个中竖线) | 1. 两边都是false，结果是false 2. 一边是true，结果是true 短路特点： 符号左边是true，右边不再运算。  |

逻辑运算符，是用来连接两个布尔类型结果的运算符，运算结果都是布尔值 true 或者 false

```java

public static void main(String[] args) { 
    System.out.println(true && true);//true 
    System.out.println(true && false);//false 
    System.out.println(false && true);//false，右边不计算 
    System.out.println(false || false);//falase 
    System.out.println(false || true);//true 
    System.out.println(true || false);//true，右边不计算 
    System.out.println(!false);//true 
}
```
###三元运算符
**数据类型 变量名 = 布尔类型表达式？结果1：结果2**

```java
public static void main(String[] args) { 
    int i = (1==2 ? 100 : 200); 
    System.out.println(i);//200 
    int j = (3<=4 ? 500 : 600); 
    System.out.println(j);//500 
}
```











