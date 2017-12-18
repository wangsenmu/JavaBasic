package com.wsm.singleton;

/**
 * Created by wangsm on 2017/12/18.
 * 静态内部内 (建议使用)
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class SingletonHandler {
        private final static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHandler.instance;
    }
}
