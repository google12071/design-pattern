package com.learn.java.dp.builder;

/**
 * 指导对象装配
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 控制对象的创建流程和顺序
     */
    public BuildProduct construct() {
        builder.buildProductA();
        builder.buildProductB();
        builder.buildProductC();
        return builder.buildProduct();
    }
}
