package com.learn.java.dp.singleton;

/**
 * 饥饿式
 */
public class HungrySingleton {
    /**
     * 类加载时创建对象实例，非按需创建，造成一定的内存浪费
     */
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
