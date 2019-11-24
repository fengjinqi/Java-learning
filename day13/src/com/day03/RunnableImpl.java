package com.day03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 同步锁
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    //创建锁对象
    Object obj =new Object();
    //Lock
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        //System.out.println(this);
        while (true){
           /* //同步代码块
            synchronized (obj){
                if (ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }*/
           //同步方法
            test();
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }else {
                lock.unlock();
                break;
            }

        }

    }

    /**
     * 同步锁方法
     * 如果使用静态的话那么属性也要加静态属性
     */
    public synchronized void test(){
        if (ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
