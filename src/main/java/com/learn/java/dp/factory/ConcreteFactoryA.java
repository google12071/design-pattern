package com.learn.java.dp.factory;

/**
 * 具体工厂A,仅创建具体产品A
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public Product createProduct(int a, int b) {
        return new ConcreteProductA(a, b);
    }

    @Override
    public Product createProduct(int a, int b, int c) {
        return new ConcreteProductA(a, b, c);
    }
}
