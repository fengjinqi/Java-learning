**数组概念：**
 
 数组就是存储数据长度固定的容器，保证多个数据的数据类型要一致
 
 ## 数组的定义
 
 **格式一**
 
 数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
 
 数组定义格式详解：
 
 数组存储的数据类型： 创建的数组容器可以存储什么数据类型。
 
 [] : 表示数组。
 
 数组名字：为定义的数组起个变量名，满足标识符规范，可以使用名字操作数组。
 
 new：关键字，创建数组使用的关键字。
 
 数组存储的数据类型： 创建的数组容器可以存储什么数据类型。
 
 [长度]：数组的长度，表示数组容器中可以存储多少个元素。
 
 注意：数组有定长特性，长度一旦指定，不可更改。
 
 和水杯道理相同，买了一个2升的水杯，总容量就是2升，不能多也不能少。
 
 **列：**
 
 ```java
int[] arr = new int[3];
```

**格式二**

数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};

**列：**

```java
int[] arr = new int[]{1,2,3,4,5};
```

**格式三**

数据类型[] 数组名 = {元素1,元素2,元素3...};

**列：**

```java
int[] arr = {1,2,3,4,5};
```

## 数组的访问

**索引：** 

每一个存储到数组的元素，都会自动的拥有一个编号，从0开始，这个自动编号称为数组索引
(index)，可以通过数组的索引访问到数组中的元素。

**格式**

数组名[索引]

**数组的长度属性：** 

每个数组都具有长度，而且是固定的，Java中赋予了数组的一个属性，可以获取到数组的
长度，语句为： 数组名.length ，属性length的执行结果是数组的长度，int类型结果。由次可以推断出，数
组的最大索引值为 数组名.length-1 。

```java
public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    //打印数组的属性，输出结果是5
    System.out.println(arr.length);
}
```

**索引访问数组中的元素：**

数组名[索引]=数值，为数组中的元素赋值
变量=数组名[索引]，获取出数组中的元素
```java
public static void main(String[] args) {
    //定义存储int类型数组，赋值元素1，2，3，4，5
    int[] arr = {1,2,3,4,5};
    //为0索引元素赋值为6
    arr[0] = 6;
    //获取数组0索引上的元素
    int i = arr[0];
    System.out.println(i);
    //直接输出数组0索引元素
    System.out.println(arr[0]);
}
```

**数组遍历**

```java
public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```
 
 **数组获取最大值元素**
 
 ```java
public static void main(String[] args) {
    int[] arr = { 5, 15, 2000, 10000, 100, 4000 };
    //定义变量，保存数组中0索引的元素
    int max = arr[0];
    //遍历数组，取出每个元素
    for (int i = 0; i < arr.length; i++) {
        //遍历到的元素和变量max比较
        //如果数组元素大于max
        if (arr[i] > max) {
            //max记录住大值
            max = arr[i];
        }
    }
    System.out.println("数组最大值是： " + max);
}
```
 **数组反转**
 
 ```java
public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    /*
    循环中定义变量min=0最小索引
    max=arr.length‐1最大索引
    min++,max‐‐
    */
    for (int min = 0, max = arr.length ‐ 1; min <= max; min++, max‐‐) {
        //利用第三方变量完成数组中的元素交换
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
    }
    // 反转后，遍历数组
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```
 
 ## 数组作为方法参数和返回值
 
 **数组作为方法参数**
 
 数组作为方法参数传递，传递的参数是数组内存的地址。
 ````java
public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9 };
    //调用方法，传递数组
    printArray(arr);
}
/*
创建方法，方法接收数组类型的参数
进行数组的遍历
*/
public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
````
 
 **数组作为方法返回值**
 
 数组作为方法的返回值，返回的是数组的内存地址
 ```java
public static void main(String[] args) {
    //调用方法，接收数组的返回值
    //接收到的是数组的内存地址
    int[] arr = getArray();
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
/*
创建方法，返回值是数组类型
return返回数组的地址
*/
public static int[] getArray() {
    int[] arr = { 1, 3, 5, 7, 9 };
    //返回数组的地址，返回到调用者
    return arr;
}
```
 **方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值**
 
 
 
 
 
 
 
 
 
 