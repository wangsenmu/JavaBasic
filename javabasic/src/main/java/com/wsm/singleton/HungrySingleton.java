package com.wsm.singleton;

/**
 * Created by wangsm on 2017/12/18.
 * 饿汉模式 （建议使用）
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
