package com.wsm.atomicstudy;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by wangsm on 2017/12/29.
 */
public class AtomicBooleanTest {

    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();

        //源码是用volatile修饰的int 型的 value用1 和0 表示true or false
        atomicBoolean.set(false);
        atomicBoolean.get();

    }
}
