package com.zhouwf.ThreadTest;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.FutureTask;
@Slf4j(topic = "c.ThreadRunTest")
public class ThreadRunTest {
    public static void main(String[] args) {
            FutureTask<Integer> ft = new FutureTask<>(() -> {
                Thread.sleep(1000);
                log.debug("running");
                return 10;
            });
            Thread t3 = new Thread(ft, "t3");
t3.start();
           // t3.run();
            log.debug("main3");
    }
}
