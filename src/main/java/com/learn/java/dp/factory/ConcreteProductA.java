package com.learn.java.dp.factory;

/**
 * 具体产品类
 */
public class ConcreteProductA implements Product {
    private int a;
    private int b;
    private int c;

    public ConcreteProductA() {
    }

    public ConcreteProductA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ConcreteProductA(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
