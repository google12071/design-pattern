package com.learn.java.dp.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        //双重检查加锁
        DCLSingleton s1 = DCLSingleton.getInstance();
        DCLSingleton s2 = DCLSingleton.getInstance();
        System.out.println(s1 == s2);

        //饥饿式
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h1 == h2);

        //静态内部类
        InnerClassSingleton i1 = InnerClassSingleton.getInstance();
        InnerClassSingleton i2 = InnerClassSingleton.getInstance();
        System.out.println(i1 == i2);
    }
}
