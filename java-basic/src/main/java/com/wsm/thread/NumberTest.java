package com.wsm.thread;

/**
 * Created by wangsm on 2017/12/18.
 */
public class NumberTest {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();

        Thread t1 = new IncreaseThread(numberHolder);
        Thread t2 = new DecreaseThread(numberHolder);

        t1.start();
        t2.start();
    }
}