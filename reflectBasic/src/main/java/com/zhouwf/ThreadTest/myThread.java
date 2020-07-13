package com.zhouwf.ThreadTest;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.FutureTask;

@Slf4j(topic = "c.myThread")
public class myThread {
    public static void main(String[] args) {

        CreateThread();
        CreateThread1();
        CreateThread3();
    }

    private static void CreateThread3() {
        FutureTask<Integer> ft = new FutureTask<>(() -> {
            Thread.sleep(1000);
            log.debug("running");
            return 10;
        });
        Thread t3 = new Thread(ft, "t3");
        //t3.start();
        t3.run();
        log.debug("main3");
    }

    public static void CreateThread() {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("running end");
        });
        t1.setName("t1");
        t1.start();
        log.debug("main");
    }

    public static  void CreateThread1(){
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("running");
        };
        Thread t2 = new Thread(runnable);
        t2.setName("t2");
        t2.start();
        log.debug("main2");
    }
}
