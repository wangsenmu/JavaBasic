package com.wsm.jdk8special;

import java.util.function.Supplier;

/**
 * Created by wangsm on 2017/12/26.
 */
public interface DefaultableFactory {

    static Defaultable create( Supplier< Defaultable > supplier){
        return supplier.get();
    }

}
