package com.wsm.jdk8special;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangsm on 2017/12/26.
 */
public class MainTest {

    public static void main(String[] args) {

        Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);

        System.out.println(defaultable.getName());

        defaultable = DefaultableFactory.create(OverrideAbleImpl::new);

        System.out.println(defaultable.getName());

        testCollectionDefaultMethod();

        Collection collection;
        Collections collections;

    }

    static void testCollectionDefaultMethod(){
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("a");
        list.add("bc");
        list.add("b");
        final String aStr = "a";
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return aStr.equals(s);
            }
        });

        System.out.println(list.size());

        list.forEach(cc-> System.out.printf(cc));
        list.forEach(cc-> cc.equals("bc"));
        list.forEach(System.err::println);
        System.out.println(list.size());


    }



}
