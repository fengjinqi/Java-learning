package com.day04;

public class ChiHuo extends Thread{
    private BaoZi baoZi;
    public ChiHuo(BaoZi baoZi){
       this.baoZi =baoZi;
    }
    @Override
    public void run() {
        while (true)
        {
            synchronized (baoZi){
                if (baoZi.flag==false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+baoZi.pi+baoZi.xian+"包子");
                baoZi.flag=false;
                baoZi.notify();
                System.out.println("吃货已经把"+baoZi.pi+baoZi.xian+"吃完了");
                System.out.println("=====================");
            }
        }
    }
}
