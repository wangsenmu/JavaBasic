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
 * 【final方法为何会高效】：
   final方法会在编译的过程中利用内嵌机制进行inline优化。
   inline优化是指：在编译的时候直接调用函数代码替换，而不是在运行时调用函数。
   inline需要在编译的时候就知道最后要用哪个函数，
   显然，非final是不行的。
   非final方法可能在子类中被重写，由于可能出现多态的情况，编译器在编译阶段
   并不能确定将来调用方法的对象的真正类型，也就无法确定到底调用哪个方法。
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

