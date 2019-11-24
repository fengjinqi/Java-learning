package com.day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutors {
    public static void main(String[] args) {
        //指定线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
    }
}
