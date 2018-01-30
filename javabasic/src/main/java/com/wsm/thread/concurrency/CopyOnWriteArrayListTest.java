package com.wsm.thread.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangsm on 2018/1/12.
 */
public class CopyOnWriteArrayListTest {


    public void test(){

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        Collections.synchronizedMap(new HashMap<>());

        ExecutorService es = Executors.newFixedThreadPool(2);





    }




}
