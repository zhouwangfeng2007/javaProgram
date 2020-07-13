package com.zhouwf.ThreadTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.threadSleepTest")
public class ThreadSleepTest {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            int count = 0;
            for (; ; ) {

                log.debug("task1-{}", count++);
            }
        };
        Runnable task2 = () -> {
            int count = 0;
            for (; ; ) {

                log.debug("task2->{}", count++);
            }
        };


        Thread t1 = new Thread(task1,"task1");
        Thread t2=new Thread(task2,"task2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}
