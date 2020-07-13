package com.zhouwf.ThreadTest;


import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.ThreadJoinTest")
public class ThreadJoinTest {
    static int r;

    public static void main(String[] args) throws Exception {
        test1();
        test2();
    }

    private static void test2() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 =new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        long start=System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end=System.currentTimeMillis();
        log.debug("程序执行耗时：{}",end-start);
    }

    private static void test1() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            log.debug("t1 running");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            r = 10;
        });

        t1.start();
        t1.join();
        log.debug("{}", r);
    }
}
