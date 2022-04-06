package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂，生产产品族产品(A1,B1)，组合成产品等级
 *
 * @author lfq
 */
@Slf4j
public class ConcreteAbstractFactoryLevel1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        log.info("ConcreteAbstractFactoryLevel1 create ConcreteAbstractProductA1");
        return new ConcreteAbstractProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        log.info("ConcreteAbstractFactoryLevel1 create ConcreteAbstractProductB1");
        return new ConcreteAbstractProductB1();
    }
}
