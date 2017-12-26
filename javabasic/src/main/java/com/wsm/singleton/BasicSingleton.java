package com.wsm.singleton;

/**
 * Created by wangsm on 2017/12/18.
 * 基本的单例模式只能用于单线程
 */
public class BasicSingleton {


    private static BasicSingleton basicSingleton = null;

    public BasicSingleton() {

    }

    public static BasicSingleton getInstance() {
        if (basicSingleton == null)
            return new BasicSingleton();
        return basicSingleton;
    }


}
