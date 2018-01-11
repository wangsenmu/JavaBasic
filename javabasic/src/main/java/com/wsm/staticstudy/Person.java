package com.wsm.staticstudy;

/**
 * Created by wangsm on 2018/1/11.
 */
public class Person {
    public Person() {

        System.out.println(1223);
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
