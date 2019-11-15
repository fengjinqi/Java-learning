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
