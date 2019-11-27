#接口
接口，是Java语言中一种引用类型，是方法的集合，如果说类的内部封装了成员变量、构造方法和成员方法，那么 接口的内部主要就是封装了方法，包含抽象方法（JDK 7及以前），默认方法和静态方法（JDK 8），私有方法 （JDK 9）。 接口的定义，它与定义类方式相似，但是使用 interface 关键字。它也会被编译成.class文件，但一定要明确它并 不是类，而是另外一种引用数据类型。 引用数据类型：数组，类，接口。 接口的使用，它不能创建对象，但是可以被实现（ implements ，类似于被继承）。一个实现接口的类（可以看做 是接口的子类），需要实现接口中所有的抽象方法，创建该类对象，就可以调用方法了，否则它必须是一个抽象 类。

```java
public interface 接口名称 { 
    // 抽象方法 
    // 默认方法 
    // 静态方法 
    // 私有方法 
}
```
**含有抽象方法**

```java
public interface InterFaceName { 
    public abstract void method();
}
```
**含有默认方法和静态方法**
默认方法：使用 default 修饰，不可省略，供子类调用或者子类重写。 

静态方法：使用 static 修饰，供接口直接调用

```java
public interface InterFaceName { 
    public default void method() { 
        // 执行语句 
    }
    public static void method2() {
        // 执行语句 
     }
}
```
**含有私有方法和私有静态方法**
私有方法：使用 private 修饰，供接口中的默认方法或者静态方法调用。
```java
public interface InterFaceName {
    private void method() {
        // 执行语句
    }
}
```
##基本的实现
类与接口的关系为实现关系，即类实现接口，该类可以称为接口的实现类，也可以称为接口的子类。实现的动作类似继承，格式相仿，只是关键字不同，实现使用 implements 关键字。

**非抽象子类实现接口：**
1. 必须重写接口中所有抽象方法。

2. 继承了接口的默认方法，即可以直接调用，也可以重写。

```java
class 类名 implements 接口名 {
    // 重写接口中抽象方法【必须】
    // 重写接口中默认方法【可选】
    
}
```
**抽象方法的使用必须全部实现**
定义接口：
```java
public interface LiveAble {
    // 定义抽象方法
    public abstract void eat();
    public abstract void sleep();
}
```
定义实现类：
```java
public class Animal implements LiveAble {
    @Overridepublic 
    void eat() {
        System.out.println("吃东西");
    }
    @Overridepublic 
    void sleep() {
        System.out.println("晚上睡");
    }

}

```
定义测试类：
```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象
        Animal a = new Animal();
        // 调用实现后的方法
        a.eat();
        a.sleep();
    }
}

```
**默认方法的使用**
可以继承，可以重写，二选一，但是只能通过实现类的对象来调用。

继承默认方法

定义接口：
```java
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }

}

```
定义实现类：
```java
public class Animal implements LiveAble {
    // 继承，什么都不用写，直接调用
    
}

```
定义测试类：
```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象
        Animal a = new Animal();
        // 调用默认方法
       a.fly();
    }
}

```
 **重写默认方法**
定义接口：
```java
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
}
```
定义实现类：
```java
public class Animal implements LiveAble {
    @Overridepublic 
    void fly() {
        System.out.println("自由自在的飞");
    }
}
```
定义测试类：
```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象
        Animal a = new Animal();
        // 调用重写方法
        a.fly();
    }
}
```
**静态方法的使用**
静态与.class 文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用，代码如下：

定义接口：
```java
public interface LiveAble {
    public static void run(){
        System.out.println("跑起来~~~");
    }
}

```
定义实现类：
```java
public class Animal implements LiveAble {
    // 无法重写静态方法
}
```
定义测试类：
```java
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal.run();// 【错误】无法继承方法,也无法调用
        LiveAble.run();
    }
}
```
**私有方法的使用**
私有方法：只有默认方法可以调用。

私有静态方法：默认方法和静态方法可以调用。

如果一个接口中有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，封装到私有方法中，供默认方法去调用。从设计的角度讲，私有的方法是对默认方法和静态方法的辅助。

定义接口：
```java
public interface LiveAble {
    default void func(){
        func1();func2();
    }
    private void func1(){
        System.out.println("跑起来~~~");
    }
    private void func2(){
        System.out.println("跑起来~~~");
    }
}
```

##接口的多实现
在继承体系中，一个类只能继承一个父类。而对于接口而言，一个类是可以实现多个接口的，这叫做接口的多实现。并且，一个类能继承一个父类，同时实现多个接口。

实现格式：
```java
class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3... {
    // 重写接口中抽象方法【必须】
    // 重写接口中默认方法【不重名时可选】}
    // [ ]： 表示可选操作。

}

```
**抽象方法**

接口中，有多个抽象方法时，实现类必须重写所有抽象方法。如果抽象方法有重名的，只需要重写一次。代码如下：

定义多个接口：
```java
interface A {
    public abstract void showA();
    public abstract void show();
}
interface B {
    public abstract void showB();
    public abstract void show();
}
```
定义实现类：
```java
public class C implements A,B{
    @Overridepublic 
    void showA() {
        System.out.println("showA");
    }
    @Overridepublic 
    void showB() {
        System.out.println("showB");
    }
    @Overridepublic 
    void show() {
        System.out.println("show");
    }
}
```
**默认方法**
接口中，有多个默认方法时，实现类都可继承使用。如果默认方法有重名的，必须重写一次。代码如下：

定义多个接口：
```java
interface A {
    public default void methodA(){}
    public default void method(){}
}
interface B {
    public default void methodB(){}
    public default void method(){}
}
   
```
 定义实现类：
 ```java
public class C implements A,B{
    @Override
    public void method() {
        System.out.println("method");
    }
}

```
 **静态方法**
 接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法。
 
 **优先级的问题**
 当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口中的默认方法重名，子类就近选择执行父类的成员方法。
 
 接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static fifinal修饰。
 
 接口中，没有构造方法，不能创建对象。
 
 接口中，没有静态代码块。
# 多态
多态是继封装、继承之后，面向对象的第三大特性。

多态： 是指同一行为，具有多个不同表现形式。

多态的体现多态体现的格式：

父类类型 变量名 = new 子类对象；
变量名.方法名();

父类类型：指子类对象继承的父类类型，或者实现的父接口类型。代码如下：
```java
Fu f = new Zi();f.method();
```
当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写后方法。

定义父类：
```java
public abstract class Animal {
    public abstract void eat();
}

```
定义子类：
```java
class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
}

```
定义测试类：
```java
public class Test {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Animal a1 = new Cat();
        // 调用的是 Cat 的 
        eata1.eat();
        // 多态形式，创建对象
        Animal a2 = new Dog();
        // 调用的是 Dog 的 eat
        a2.eat();
    }
}
```
**引用类型转换**

多态的转型分为向上转型与向下转型两种：

向上转型：多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的当父类引用指向一个子类对象时，便是向上转型。

使用格式：
父类类型 变量名 = new 子类类型();
如：Animal a = new Cat();

向下转型：

父类类型向子类类型向下转换的过程，这个过程是强制的。

一个已经向上转型的子类对象，将父类引用转为子类引用，可以使用强制类型转换的格式，便是向下转型。

使用格式：
子类类型 变量名 = (子类类型) 父类变量名;

如:Cat c =(Cat) a;

**转型的异常**
转型的过程中，一不小心就会遇到这样的问题，请看如下代码：
```java
public class Test {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Cat();
        a.eat();// 调用的是 Cat 的 eat
        // 向下转型
        Dog d = (Dog)a;
        d.watchHouse();// 调用的是 Dog 的 watchHouse 【运行报错】
        }
}
```
这段代码可以通过编译，但是运行时，却报出了 ClassCastException ，类型转换异常！这是因为，明明创建了Cat类型对象，运行时，当然不能转换成Dog对象的。这两个类型并没有任何继承关系，不符合类型转换的定义。为了避免ClassCastException的发生，Java提供了 instanceof 关键字，给引用变量做类型的校验，格式如下：

变量名 instanceof 数据类型

如果变量属于该数据类型，返回true

如果变量不属于该数据类型，返回false。

所以，转换前，我们最好先做一个判断，代码如下：
```java
public class Test {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Cat();
        a.eat();// 调用的是 Cat 的 eat
        // 向下转型
        if (a instanceof Cat){
            c = (Cat)a;
            c.catchMouse();// 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHouse();// 调用的是 Dog 的 watchHouse
        }
        
    }
}
 
```









