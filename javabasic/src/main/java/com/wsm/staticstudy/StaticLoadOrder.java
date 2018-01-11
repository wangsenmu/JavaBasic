package com.wsm.staticstudy;

/**
 * Created by wangsm on 2018/1/11.
 * 静态变量、静态引用变量、静态代码块加载顺序
 *
 *1、 先父类变量，遇到引用变量对应用对象进行实例化或相关操作，按代码顺序执行
 * 2、然后静态代码块执行
 * 3、调用父类构造方法
 * 4、调用自己构造方法
 *
 */
public class StaticLoadOrder extends StaticLoadOrderSupper {

    public static void main(String[] args) {
        System.out.println(new StaticLoadOrder().getClass().getName());
    }


    private static Person person = new Person();
    public static int i= 1;
    static {
        person.setAge(i);
        i++;
        System.out.println("StaticLoadOrder static block");
    }

    public StaticLoadOrder() {
        System.out.println("StaticLoadOrder construct");
    }
}

