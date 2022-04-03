package com.learn.java.dp.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteBBuilder extends Builder {
    public void buildProductA() {
        log.info("ConcreteBBuilder buildProductA()");
    }

    public void buildProductB() {
        log.info("ConcreteBBuilder buildProductB()");
    }

    public void buildProductC() {
        log.info("ConcreteBBuilder buildProductC()");
    }
}
