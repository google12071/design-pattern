package com.learn.java.dp.singleton;

/**
 * 双重检查加锁
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;

    private DCLSingleton() {
    }

    /**
     * 双重检查加锁保证线程安全
     *
     * @return
     */
    public static DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
