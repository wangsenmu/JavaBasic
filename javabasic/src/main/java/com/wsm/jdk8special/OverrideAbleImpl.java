package com.wsm.jdk8special;

/**
 * Created by wangsm on 2017/12/26.
 */
public class OverrideAbleImpl implements Defaultable {

    @Override
    public void test() {

    }

    @Override
    public String getName() {
        return "value changed";
    }
}
