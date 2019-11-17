package com.day05;

/**
 * 接口定义抽象方法
 * 接口不能直接使用，要用类实现
 * TODO Java 8
 * 允许定义默认方法 用于此接口类已被使用，后续接口新增，其他实现接口类不用去重写
 *允许定义静态方法
 * TODO java 9
 * 允许定义私有方法
 * 允许定义常量
 */
public interface MyInterfaceAbstract {
    public abstract void methods();

    /**
     * 接口默认  可被覆盖
     */
    public default void modethodDefault(){
        System.out.println("默认方法");
    }

    /**
     * 不能通过对象直接调用静态
     * 只能通过接口调用
     */
    public static void methodStatic(){
        System.out.println("静态方法");
    }

    /**
     * Java 9支持
     * 接口需要公共方法，但不允许实现类使用
     */
//    private void methodPrivate(){
//
//    }

    /**
     * Java 9支持
     * 接口需要公共静态方法，但不允许实现类使用
     */
//    private static void methodPrivate(){
//
//    }
    public static final int NUM = 10;//final不可改变大写
}
