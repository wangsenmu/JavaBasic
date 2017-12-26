package com.wsm.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by wangsm on 2017/12/25.
 */
public class MapBasic {


    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap();
//        testLinkedHashMap();
        testTreeMap();

    }

    public static void testTreeMap() {


        TreeMap<String, String> treeMap = new TreeMap();

        treeMap.put("bb", "bb");
        treeMap.put("a", "aa");
        treeMap.put("a1", "aa1");
        treeMap.put("b", "b");

        treeMap.comparator();


        for (Map.Entry<String, String> entry : treeMap.entrySet()) {

            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"  value:"+value);



        }

        System.out.println("firstKey:"+ treeMap.firstKey());
        System.out.println("lastKey:"+ treeMap.lastKey());

//        treeMap.



    }


    public static void testLinkedHashMap() {


        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("bb", "bb");
        linkedHashMap.put("a", "aa");
        linkedHashMap.put("a1", "aa1");
        linkedHashMap.put("b", "b");

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {

            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"  value:"+value);

        }


    }


}
