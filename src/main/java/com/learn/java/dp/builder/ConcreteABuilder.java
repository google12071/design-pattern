package com.learn.java.dp.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体创建者
 */
@Slf4j
public class ConcreteABuilder extends Builder {
    public void buildProductA() {
        log.info("ConcreteABuilder buildProductA()");
    }

    public void buildProductB() {
        log.info("ConcreteABuilder buildProductB()");
    }

    public void buildProductC() {
        log.info("ConcreteABuilder buildProductC()");
    }
}
