package com.wsm.staticstudy;

/**
 * Created by wangsm on 2018/1/11.
 */
public class StaticLoadOrderSupper {

    static int i = 1;

    static Person person = new Person();

    static {
        i++;
        person.setAge(i);
        System.out.println("StaticLoadOrderSupper static block");
    }

    public StaticLoadOrderSupper() {
        System.out.println("StaticLoadOrderSupper construct");
    }




}
