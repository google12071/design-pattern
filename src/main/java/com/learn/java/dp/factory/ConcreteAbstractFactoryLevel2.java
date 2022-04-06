package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂，生产产品族产品(A2,B2)，组合成产品等级
 *
 * @author lfq
 */
@Slf4j
public class ConcreteAbstractFactoryLevel2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        log.info("ConcreteAbstractFactoryLevel2 create ConcreteAbstractProductA2");
        return new ConcreteAbstractProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        log.info("ConcreteAbstractFactoryLevel2 create ConcreteAbstractProductB2");
        return new ConcreteAbstractProductB2();
    }
}
