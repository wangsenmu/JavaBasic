package com.wsm.jdk8special;

/**
 * Created by wangsm on 2017/12/26.
 */
public interface Defaultable {



    void test();

    default String getName(){
        return "jdk8";
    }

}
