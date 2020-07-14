package com.zhouwf.ThreadTest;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;

@Slf4j(topic = "c.ShareVarTest")
public class ShareVarTest {
    static int count = 0;
    static final Object room = new Object();

    public static void main(String[] args) throws InterruptedException {
        int times = 5000;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < times; i++) {
                synchronized (room){
                    count++;
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < times; i++) {
              synchronized (room) {
                  count--;
              }
            }
        }, "t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        log.debug("最终count={}", count);

    }
}
