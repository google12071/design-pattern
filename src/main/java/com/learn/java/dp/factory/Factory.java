package com.learn.java.dp.factory;

/**
 * 抽象工厂，定义对象创建逻辑
 * 具体工厂与具体产品创建逻辑一一对应
 * 工厂方法重载，满足多样化创建需求
 */
public interface Factory {
    /**
     * 创建产品（对象）
     *
     * @return
     */
    Product createProduct();

    /**
     * 创建产品（对象）
     *
     * @return
     */
    Product createProduct(int a, int b);

    /**
     * 创建产品（对象）
     *
     * @return
     */
    Product createProduct(int a, int b, int c);
}
