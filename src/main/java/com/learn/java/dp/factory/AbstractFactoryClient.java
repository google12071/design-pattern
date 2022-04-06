package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象工厂，应用案例
 *
 * @author lfq
 */
@Slf4j
public class AbstractFactoryClient {
    public static void main(String[] args) {
        //工厂生产等级1产品
        AbstractFactory factory = new ConcreteAbstractFactoryLevel1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        log.info("productA class:{},productB class:{}", productA.getClass().getName(),
                productB.getClass().getName());
    }
}
