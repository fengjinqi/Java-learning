package com.day01;

/**
 * 内部类
 * 成员内部类
 * 局部内部类
 */
public class DemoInnerClass {
    /**
     * 成员内部类
     */
    int num = 10;
    public class DemoChilderClass{
        int num = 20;

        ;
        public void beat(){

            //methods();
        }
        public void childer(){
            System.out.println("我是内部类方法");
            int num = 30;//内部类成员变量
            System.out.println(num);


            System.out.println(this.num);
            /**
             * 访问重名的外部类
             */
            System.out.println(DemoInnerClass.this.num);
        }
    }

    public void methods(){
        System.out.println("我是外部内方法");
        new DemoChilderClass().childer();// 外部类使用内部类 匿名对象
    }
}
