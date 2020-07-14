package com.zhouwf.ThreadTest;

import java.util.ArrayList;

public class ThreadUnSafeTest {
    static final int Thread_Numbers = 2;
    static final int Loop_Number = 200;

    public static void main(String[] args) {
        ThreadUnSafe test = new ThreadUnSafe();
        for (int i = 0; i < Thread_Numbers; i++) {
            Thread t = new Thread(() -> {
                test.method1(Loop_Number);
            }, "thread" + i);
            t.start();
        }
    }
}

class ThreadUnSafe {

     ArrayList<String> list = new ArrayList<>();

    public void method1(int loopNumber) {
        for (int i = 0; i < loopNumber; i++) {
            method2();
            method3();
        }
    }

    public void method2() {
        list.add("1");
    }

    public void method3() {
        list.remove(0);
    }

}
