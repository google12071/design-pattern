package com.learn.java.dp.factory;

/**
 * 抽象工厂：提供创建产品的接口，包含多个创建产品的方法，可以创建多个不同等级的产品
 *
 * @author lfq
 */
public interface AbstractFactory {
    /**
     * 创建产品族A
     *
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 创建产品族B
     *
     * @return
     */
    AbstractProductB createProductB();
}
