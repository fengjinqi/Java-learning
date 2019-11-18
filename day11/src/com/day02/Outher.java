package com.day02;

public class Outher {
    public void method(){
       final int num =10;
           class Inner{
              void methodInner(){
                 System.out.println(num);
             }
         }
        Inner inner = new Inner();
         inner.methodInner();
    }
}
