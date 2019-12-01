package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化
     */
    @Before
    public void init(){
        System.out.println("init...");

    }

    /**
     * 释放资源
     */
    @After
    public void  close(){
        System.out.println("close");
    }
    @Test
    public  void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.c(-2,3);
        int add = Calculator.add(1,3);
        Assert.assertEquals(-5,result);//断言
        Assert.assertEquals(4,add);
    }
}
