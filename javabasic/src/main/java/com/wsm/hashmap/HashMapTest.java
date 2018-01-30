package com.wsm.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangsm on 2018/1/29.
 */
public class HashMapTest {


    /*public static void main(String[] args) {

        int h= 10;
        int length=100;
        int i  = h & (length-1);
        System.out.println(i);


        HashMap<String,Object> hashMap = new HashMap<>();
        Object o = hashMap.put("test","123");
        Object o1 = hashMap.put("test","456");


        System.out.println(o);

    }*/

    static final Map<Integer, Integer> map = new HashMap<Integer, Integer>(2, 0.75f);

    //1.7中存在数据不安全问题 jdk1.7
    public static void main(String[] args) throws InterruptedException {

        map.put(5, 55);

        new Thread("Thread1") {
            public void run() {
                map.put(7, 77);
                System.out.println(map);
            };
        }.start();

        new Thread("Thread2") {
            public void run() {
                map.put(3, 33);
                System.out.println(map);
            };
        }.start();

    }

}
