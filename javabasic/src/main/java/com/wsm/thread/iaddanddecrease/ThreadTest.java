package com.wsm.thread.iaddanddecrease;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangsm on 2018/2/2.
 * 测试多线程编程中i++、i--不是原子的
 * 所以在多线程编程中要使用AtomicInteger
 */
public class ThreadTest {


    public static void main(String[] args) {

        Count count = new Count();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count.add();
                }
            }
        };


        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }
        while (true) {
            if (allThreadTerminated(threads)) {
                System.out.println("count:" + count.get());
                break;
            }
        }

    }


    private static boolean allThreadTerminated(List<Thread> threads) {

        for (Thread t : threads) {
            if (t.isAlive()) {
                return false;
            }
        }
        return true;

    }

}
