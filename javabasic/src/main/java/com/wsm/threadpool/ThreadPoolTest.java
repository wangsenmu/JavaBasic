package com.wsm.threadpool;


import java.util.Stack;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangsm on 2017/12/28.
 */
public class ThreadPoolTest {
    public static void test(){
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(15,100,20000l, TimeUnit.DAYS,null);

        Stack stack = new Stack();

        stack.add("");
        stack.get(11);
//        stack.pop()
    }


}
