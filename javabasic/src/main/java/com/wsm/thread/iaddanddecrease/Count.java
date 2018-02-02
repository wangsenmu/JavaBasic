package com.wsm.thread.iaddanddecrease;

/**
 * Created by wangsm on 2018/2/2.
 */
public class Count {

    private int num = 0;

    public void add() {
        num++;
    }

    public void decrease() {
        num--;
    }

    public int get() {
        return num;
    }


}
