package com.learn.java.dp.singleton;

/**
 * 基于内部类
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    /**
     * 静态内部类
     */
    private static class InnerClass {
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    /**
     * 按需加载
     *
     * @return
     */
    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
