package com.wsm.compareandsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangsm on 2018/2/28.
 */
public class SortList {

    public static void main(String[] args) {

        List<Test> list = new ArrayList<>();


        Test t1 = new Test(10, "张三");
        Test t2 = new Test(1, "张三");
        Test t3 = new Test(5, "张三");
        Test t4 = new Test(4, "张三");
        Test t5 = new Test(9, "张三");
        Test t6 = new Test(8, "张三");
        Test t7 = new Test(10, "张三");

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);

        Collections.sort(list, new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                return (o1.getId() > o2.getId())?-1:1;
            }
        });

        System.out.println(list);


    }

}


class Test {

    private int id;
    private String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}