package com.learn.java.dp.builder;

/**
 * 对象构建抽象,对象组装过程由具体Builder类完成
 */
public abstract class Builder {
    protected BuildProduct product = new BuildProduct();

    public abstract void buildProductA();

    public abstract void buildProductB();

    public abstract void buildProductC();

    public BuildProduct buildProduct() {
        return product;
    }
}
