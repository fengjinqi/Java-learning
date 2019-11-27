#继承、super、this、抽象类
#继承
通过 extends 关键字，可以声明一个子类继承另外一个父类，定义格式如下：
```java
class 父类 { ... }
class 子类 extends 父类 { ... }
```

# super和this

super和this的含义 

super ：代表父类的存储空间标识(可以理解为父亲的引用)。 

this ：代表当前对象的引用(谁调用就代表谁)。 super和this的用法

this.成员变量 ‐‐ 本类的
 
 super.成员变量 ‐‐ 父类的 
 
 this.成员方法名() ‐‐ 本类的 
 
 super.成员方法名() ‐‐ 父类的
 
 ```java
class com.day01.Animal { 
    public void eat() { 
        System.out.println("animal : eat"); 
    } 
}
class com.day01.Cat extends com.day01.Animal { 
    public void eat() { 
        System.out.println("cat : eat");
    }
    public void eatTest() { 
        this.eat(); // this 调用本类的方法 
        super.eat(); // super 调用父类的方法 
    } 
}
public class ExtendsDemo08 { 
    public static void main(String[] args) { 
        com.day01.Animal a = new com.day01.Animal(); 
        a.eat(); 
        com.day01.Cat c = new com.day01.Cat(); 
        c.eatTest(); 
    } 
}
输出结果为： animal : eat cat : eat animal : eat
```

**访问构造方法**
this(...) ‐‐ 本类的构造方法 

super(...) ‐‐ 父类的构造方法

子类的每个构造方法中均有默认的super()，调用父类的空参构造。手动调用父类构造会覆盖默认的super()。 super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现。

#继承的特点
**Java只支持单继承，不支持多继承。**
```java
//一个类只能有一个父类，不可以有多个父类。 
class C extends A{} //ok 
class C extends A，B... //error
```
**Java支持多层继承(继承体系)。**
```java
class A{}
class B extends A{}
class C extends B{}
```
顶层父类是Object类。所有的类默认继承Object，作为父类。
# 抽象类
父类中的方法，被它的子类们重写，子类各自的实现都不尽相同。那么父类的方法声明和方法主体，只有声明还有意义，而方法主体则没有存在的意义了。我们把没有方法主体的方法称为抽象方法。Java语法规定，包含抽象方法的类就是抽象类。

**定义**
抽象方法 ： 没有方法体的方法

抽象类：包含抽象方法的类。

##abstract使用格式
**抽象方法**
使用 abstract 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体。
**定义格式：**
修饰符 abstract 返回值类型 方法名 (参数列表)；

代码举例：public abstract void run()；

##抽象类
如果一个类包含抽象方法，那么该类必须是抽象类。
**定义格式：**
```java
abstract class 类名字 {}
```
代码举例：
```java

public abstract class com.day01.Animal {
    public abstract void run();
}
```
##抽象的使用
继承抽象类的子类必须重写父类所有的抽象方法。否则，该子类也必须声明为抽象类。最终，必须有子类实现该父类的抽象方法，否则，从最初的父类到最终的子类都不能创建对象，失去意义。

代码举例：
```java
public class com.day01.Cat extends Animal {
    public void run (){
        System.out.println("小猫在墙头走~~~");
    }
}
public class CatTest {
    public static void main(String[] args) {
        // 创建子类对象
        com.day01.Cat c = new com.day01.Cat();// 调用run方法
       c.run();
    }
}
    输出结果：小猫在墙头走~~~
    
```
此时的方法重写，是子类对父类抽象方法的完成实现，我们将这种方法重写的操作，也叫做实现方法。

注意事项关于抽象类的使用，

1. 抽象类不能创建对象，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象。理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义。

2. 抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。理解：子类的构造方法中，有默认的super()，需要访问父类构造方法。

3. 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。理解：未包含抽象方法的抽象类，目的就是不想让调用者创建该类对象，通常用于某些特殊的类结构设计。

4. 抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类。理解：假设不重写所有抽象方法，则类中可能包含抽象方法。那么创建对象后，调用抽象的方法，没有意义。





