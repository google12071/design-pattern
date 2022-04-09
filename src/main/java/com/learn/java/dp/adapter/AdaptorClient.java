package com.learn.java.dp.adapter;

/**
 * 适配器client
 */
public class AdaptorClient {
    public static void main(String[] args) {
        /**
         * 通过适配器对类进行不兼容适配
         */
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
