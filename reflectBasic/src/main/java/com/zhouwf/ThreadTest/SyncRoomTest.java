package com.zhouwf.ThreadTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.SycRoomTest")
public class SyncRoomTest {
    public static void main(String[] args) throws InterruptedException {
        int times = 5000;
        Room2 room = new Room2();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < times; i++) {
                room.increment();
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < times; i++) {
                room.decrement();
            }
        }, "t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        log.debug("最终Room中的值={}", room.getValue());
    }
}

class Room {
    int value = 0;

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public void decrement() {
        synchronized (this) {
            value--;
        }
    }

    public int getValue() {
        synchronized (this) {
            return value;
        }
    }
}


class Room2 {
    int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public synchronized int getValue() {
        return value;
    }
}