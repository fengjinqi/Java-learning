#  面向对象
Java语言是一种面向对象的程序设计语言，而面向对象思想是一种程序设计思想，我们在面向对象思想的指引下， 使用Java语言去设计、开发计算机程序。 这里的对象泛指现实中一切事物，每种事物都具备自己的属性和行为。面 向对象思想就是在计算机程序设计过程中，参照现实中事物，将事物的属性特征、行为特征抽象出来，描述成计算 机事件的设计思想。 它区别于面向过程思想，强调的是通过调用对象的行为来实现功能，而不是自己一步一步的去 操作实现。

**举例**

洗衣服:

 面向过程：把衣服脱下来-->找一个盆-->放点洗衣粉-->加点水-->浸泡10分钟-->揉一揉-->清洗衣服-->拧干-->晾 起来
 
 面向对象：把衣服脱下来-->打开全自动洗衣机-->扔衣服-->按钮-->晾起来
 
区别:面向过程：强调步骤。

 面向对象：强调对象，
 
 这里的对象就是洗衣机。 特点面向对象思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。 面向对象的语言中，包含了三大基本特征，即**封装、继承和多态**。 
 
## 类和对象 

环顾周围，你会发现很多对象，比如桌子，椅子，同学，老师等。桌椅属于办公用品，师生都是人类。那么什么是 类呢？什么是对象呢？ 
 **类：**
 
 是一组相关属性和行为的集合。可以看成是一类事物的模板，使用事物的属性特征和行为特征来描述该 类事物。 现实中，描述一类事物： 
 
 **属性：**
 
 就是该事物的状态信息。 
 
 **行为：**
 
 就是该事物能够做什么。 
 
 举例：小猫。 属性：名字、体重、年龄、颜色。 行为：走、跑、叫。 什么是对象 对象：是一类事物的具体体现。对象是类的一个实例（对象并不是找个女朋友），必然具备该类事物的属性 和行为。 
 
 现实中，一类事物的一个实例：一只小猫。 
 
 举例：一只小猫。 属性：tom、5kg、2 years、yellow。 
 
 行为：溜墙根走、蹦跶的跑、喵喵叫。
 
 ## 类与对象的关系
 
 **类是对一类事物的描述，是抽象的。**
 
  **对象是一类事物的实例，是具体的。**
   
  **类是对象的模板，对象是类的实体。**
  
## 类的定义

类的定义格式

成员变量：对应事物的属性 成员方法：对应事物的行为

```java

public class ClassName {
    //成员变量
    //成员方法
}
```
定义类：就是定义类的成员，包括成员变量和成员方法。

成员变量：和以前定义变量几乎是一样的。只不过位置发生了改变。在类中，方法外。

成员方法：和以前定义方法几乎是一样的。只不过把static去掉，
```java
public class Student {
    //成员变量
    String name；//姓名
    int age；//年龄
    //成员方法
    //学习的方法
    publicvoid study() {
    System.out.println("好好学习，天天向上");
    }
    //吃饭的方法
    publicvoid eat() {
    System.out.println("学习饿了要吃饭");
    }
}
```


##对象的使用

对象的使用格式

**类名 对象名 = new 类名();**

使用对象访问类中的成员:

对象名.成员变量；

对象名.成员方法()；

```java

public class Test01_Student {
    public static void main(String[] args) {
        //创建对象格式：类名 对象名 = new 类名();
        Student s = new Student();
        System.out.println("s:"+s); //cn.itcast.Student@100363
        //直接输出成员变量值
        System.out.println("姓名："+s.name); //null
        System.out.println("年龄："+s.age); //0
        System.out.println("‐‐‐‐‐‐‐‐‐‐");
        //给成员变量赋值
        s.name = "赵丽颖";
        s.age = 18;
        //再次输出成员变量的值
        System.out.println("姓名："+s.name); //赵丽颖
        System.out.println("年龄："+s.age); //18
        System.out.println("‐‐‐‐‐‐‐‐‐‐");
        //调用成员方法
        s.study(); // "好好学习，天天向上"
        s.eat(); // "学习饿了要吃饭"
    }  
}
```

**成员变量的默认值**


  |   | 数据类型  |  默认值 |
  | ------------ | ------------ | ------------ |
  |  基本类型 |  整数（byte，short，int，long） | 0 |
  |   | 浮点数（float，double）   | 0.0  |
  |   |  字符（char）  | '\u0000'  |
  |   | 布尔（boolean） false  |false   |
  |  引用类型 | 数组，类，接口  | null  |

**成员变量和局部变量区别**

**在类中的位置不同**

成员变量：类中，方法外

局部变量：方法中或者方法声明上(形式参数)

**作用范围不一样**

成员变量：类中

局部变量：方法中

**初始化值的不同**

成员变量：有默认值

局部变量：没有默认值。必须先定义，赋值，最后使用

**在内存中的位置不同**

成员变量：堆内存

局部变量：栈内存

**生命周期不同** 

成员变量：随着对象的创建而存在，随着对象的消失而消失

局部变量：随着方法的调用而存在，随着方法的调用完毕而消失

#封装

面向对象编程语言是对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作和修改。
封装可以被认为是一个保护屏障，防止该类的代码和数据被其他类随意访问。要访问该类的数据，必须通过指定的
方式。适当的封装可以让代码更容易理解与维护，也加强了代码的安全性。

**将属性隐藏起来，若需要访问某个属性，提供公共方法对其访问。**

**封装的步骤**

使用 private 关键字来修饰成员变量。

对需要访问的成员变量，提供对应的一对 getXxx 方法 、 setXxx 方法。
 
 **private的含义**
 
 1. private是一个权限修饰符，代表最小权限。
 
 2. 可以修饰成员变量和成员方法。
 
 3. 被private修饰后的成员变量和成员方法，只在本类中才能访问。
 
 **private的使用格式**
 
 private 数据类型 变量名 ；
 
 1. 使用 private 修饰成员变量，代码如下：
 
 ```java
public class Student {
    private String name;
    private int age;
}
```

 2. 提供 getXxx 方法 / setXxx 方法，可以访问成员变量，代码如下：
 ```java
public class Student {
    private String name;
    private int age;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
}
```
##this关键字

this代表所在类的当前对象的引用（地址值），即对象自己的引用。

**this使用格式**

this.成员变量名

使用 this 修饰方法中的变量，解决成员变量被隐藏的问题，代码如下：
```java

public class Student {
    private String name;
    private int age;
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public int getAge() {
        return age;
    }
}
```
## 构造方法

**构造方法的定义格式**

```java
修饰符 构造方法名(参数列表){
// 方法体
}
```
构造方法的写法上，方法名与它所在的类名相同。它没有返回值，所以不需要返回值类型，甚至不需要void。使用
构造方法后

```java
public class Student {
    private String name;
    private int age;
    // 无参数构造方法
    public Student() {}
    // 有参数构造方法
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
```
如果你不提供构造方法，系统会给出无参数构造方法。
如果你提供了构造方法，系统将不再提供无参数构造方法。
构造方法是可以重载的，既可以定义参数，也可以不定义参数。







