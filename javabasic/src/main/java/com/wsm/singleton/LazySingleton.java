package com.wsm.singleton;

/**
 * Created by wangsm on 2017/12/18.
 * <p>
 * 懒汉式，可用多线程
 */
public class LazySingleton {


    private static LazySingleton singleton = null;

    public LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (singleton == null)
            return new LazySingleton();
        return singleton;
    }
}
