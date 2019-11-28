#final关键字
final 关键字， 用于修饰不可改变内容。 final： 不可改变。可以用于修饰类、方法和变量。 类：被修饰的类，不能被继承。 
方法：被修饰的方法，不能被重写。 
变量：被修饰的变量，不能被重新赋值。
**使用方式**

##修饰类
```java
final class 类名{}
```
##修饰方法
```java
修饰符 final 返回值类型 方法名(参数列表){
    //方法体
}
```
##修饰变量

```java
final 变量类型 变量名=值
```
**final**声明后不可再更改类似js的const常量

#权限修饰符
在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限，

public：公共的。

protected：受保护的

default：默认的

private：私有的

	
|   | public  |  protected |  default |  private |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| 同一类中  |  &radic; |   &radic;|  &radic; | &radic;  |
| 同一包中(子类与无关类)  | &radic;  |&radic;   |  &radic; |   |
|  不同包的子类 | &radic;  |  &radic; |   |   |
|  不同包中的无关类 |  &radic; |   |   |   |

可见，public具有最大权限。private则是最小权限。编写代码时，如果没有特殊的考虑，建议这样使用权限：

成员变量使用 private ，隐藏细节。

构造方法使用 public ，方便创建对象成员

方法使用 public ，方便调用方法。

#内部类
内部类将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类。

成员内部 ：定义在类中方法外的类

**定义格式：**

class 外部类 {class 内部类{}}

访问特点

内部类可以直接访问外部类的成员，包括私有成员。外部类要访问内部类的成员，必须要建立内部类的对象。

**创建内部类对象格式：**

外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；

```java
public class Person {
    private boolean live = true;
    class Heart {
        public void jump() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
        public boolean isLive() {
            return live;
        }
        public void setLive(boolean live) {
            this.live = live;
        }
    }
};
//=================================================
public static void main(String[] args) {
    // 创建外部类对象
    Person p = new Person();
    // 创建内部类对象
    Heart heart = p.new Heart();
    // 调用内部类方法
    heart.jump();
    // 调用外部类方法
    p.setLive(false);
    // 调用内部类方法
    heart.jump();
}

```
#匿名内部类
匿名内部类 ：是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 子类对象。

**前提**
匿名内部类必须继承一个父类或者实现一个父接口。
**格式**
```java
new 父类名或者接口名(){
    // 方法重写
    @Override
    public void method() {
        // 执行语句
    }
}
```