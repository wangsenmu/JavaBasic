package com.wsm.singleton;

/**
 * Created by wangsm on 2017/12/18.
 * 加同步锁时，前后两次判断实例是否存在
 */
public class TwiceSyncSingleton {

    private static TwiceSyncSingleton syncSingleton = null;

    public TwiceSyncSingleton() {
    }

    public static TwiceSyncSingleton genInstance() {
        if (syncSingleton == null) {
            synchronized (TwiceSyncSingleton.class) {
                if (syncSingleton == null) {
                    syncSingleton = new TwiceSyncSingleton();
                }
            }
        }
        return syncSingleton;
    }
}
