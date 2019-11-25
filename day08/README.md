#String类、static关键字、Arrays类、 Math类
java.lang.String 类代表字符串。Java程序中所有的字符串文字（例如 "abc" ）都可以被看作是实现此类的实 例。

 字符串不变：字符串的值在创建后不能被更改。
```java
String s1 = "abc";
s1 += "d";
System.out.println(s1); // "abcd// 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"
```
 因为String对象是不可变的，所以它们可以被共享。
```java
String s1 = "abc";
String s2 = "abc";// 内存中只有一个"abc"对象被创建，同时被s1和s2共享。
```

"abc" 等效于 char[] data={ 'a' , 'b' , 'c' } 。

```java
例如：
String str = "abc";
相当于：
char data[] = {'a', 'b', 'c'};
String str = new String(data)// String底层是靠字符数组实现的。
```
列：
```java
// 无参构造
String str = new String（）
// 通过字符数组构造
char chars[] = {'a', 'b', 'c'};
String str2 = new String(chars)
// 通过字节数组构造
byte bytes[] = { 97, 98, 99 };
 String str3 = new String(bytes);
```

##常用方法

**判断**

public boolean equals (Object anObject) ：将此字符串与指定对象进行比较。

public boolean equalsIgnoreCase (String anotherString) ：将此字符串与指定对象进行比较，忽略大小写。


```java
public class String_Demo01 {
    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
         //boolean equals(Object obj):比较字符串的内容是否相同
         System.out.println(s1.equals(s2)); 
         trueSystem.out.println(s1.equals(s3)); // false
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
    }
}
```

**获取功能方法**

public int length () ：返回此字符串的长度。

public String concat (String str) ：将指定的字符串连接到该字符串的末尾。

public char charAt (int index) ：返回指定索引处的 char值

public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。

public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。

public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。


```java
public class String_Demo02 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "helloworld";
        // int length():获取字符串的长度，其实也就是字符个数
        System.out.println(s.length());
        System.out.println("‐‐‐‐‐‐‐‐");
        // String concat (String str):将将指定的字符串连接到该字符串的末尾.
        String s = "helloworld";
        String s2 = s.concat("**hello itheima");
        
        System.out.println(s2);// helloworld**hello itheima
        // char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("‐‐‐‐‐‐‐‐");
        // int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("ak"));
        System.out.println("‐‐‐‐‐‐‐‐");
        // String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("‐‐‐‐‐‐‐‐");
        // String substring(int start,int end):从start到end截取字符串。含start，不含end。
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3,8));
    }
}
```

**转换方法**

public char[] toCharArray () ：将此字符串转换为新的字符数组。

public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。

public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使用replacement字符串替换。

```java
public class String_Demo03 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "abcde";
        // char[] toCharArray():把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for(int x = 0; x < chs.length; x++) {
            System.out.println(chs[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
        // byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for(int x = 0; x < bytes.length; x++) {
            System.out.println(bytes[x]);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");// 替换字母it为大写IT
        String str = "itcast itheima";
        String replace = str.replace("it", "IT");
        System.out.println(replace); // ITcast ITheimaSystem.out.println("‐‐‐‐‐‐‐‐‐‐‐")
    }
}
```

**分割**

public String[] split(String regex) ：将此字符串按照给定的regex（规则）拆分为字符串数组。

```java
public class String_Demo03 {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "aa|bb|cc";
        String[] strArray = s.split("|"); 
        // ["aa","bb","cc"]
        for(int x = 0; x < strArray.length; x++) {
            System.out.println(strArray[x]); // aa bb cc
          
        }
    }
}
```

# static关键字
关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。

##定义和使用格式

**定义**
static 数据类型 变量名；

列：

static int age;

**调用：**
```java
// 访问类变量

类名.类变量名；

// 调用静态方法
类名.静态方法名(参数)
```

#Arrays类
java.util.Arrays 此类包含用来操作数组的各种方法，比如排序和搜索等。其所有方法均为静态方法，调用起来非常简单。

public static String toString(int[] a) ：返回指定数组内容的字符串表示形式。

```java
public static void main(String[] args) {
    
    // 定义int 数组
    int[] arr = {2,34,35,4,657,8,69,9};
    // 打印数组,输出地址值
    System.out.println(arr); // [I@2ac1fdc4// 
    // 数组内容转为字符串
    String s = Arrays.toString(arr);
    // 打印字符串,输出内容
    System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]}
}
```
public static void sort(int[] a) ：对指定的 int 型数组按数字升序进行排序。
```java
public static void main(String[] args) {
    // 定义int 数组
    int[] arr = {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
    System.out.println("排序前:"+ Arrays.toString(arr)); // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6,2]
    // 升序排序
    Arrays.sort(arr);
    System.out.println("排序后:"+ Arrays.toString(arr));// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46,48]}
}
```

#Math类
java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。

public static double abs(double a) ：返回 double 值的绝对值。
```java
double d1 = Math.abs(‐5); //d1的值为5
double d2 = Math.abs(5); //d2的值为5
```
public static double ceil(double a) ：返回大于等于参数的最小的整数。

```java
double d1 = Math.ceil(3.3); //d1的值为 4.0
double d2 = Math.ceil(‐3.3); //d2的值为 ‐3.0
double d3 = Math.ceil(5.1); //d3的值为 6.0
```
public static double floor(double a) ：返回小于等于参数最大的整数。

```java
double d1 = Math.floor(3.3); //d1的值为3.0
double d2 = Math.floor(‐3.3); //d2的值为‐4.0
double d3 = Math.floor(5.1); //d3的值为 5.0
```
public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)

```java
long d1 = Math.round(5.5); //d1的值为6.0
long d2 = Math.round(5.4); //d2的值为5.0
```























