package com.wsm.io;

/**
 * Created by wangsm on 2018/1/3.
 * jdk1.7 以后支持try（）中new Io自动关闭
 */
public class IOCloseTest {

    public static void main(String[] args) {

        int j =0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<100000000;i++){
            j+=i;
        }

        for(int i=1;i<100000000;i++){
            j+=i;
        }
        for(int i=1;i<100000000;i++){
            j+=i;
        }
        for(int i=1;i<100000000;i++){
            j+=i;
        }
        for(int i=1;i<100000000;i++){
            j+=i;
        }
        for(int i=1;i<100000000;i++){
            j+=i;
        }
        for(int i=1;i<100000000;i++){
            j+=i;
        }
        System.out.println(j);

    }

    public void testClose(){

    }

}
