package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰器类B
 */
@Slf4j
public class ConcreteBDecorator extends Decorator {
    public ConcreteBDecorator(Component component) {
        super(component);
    }

    @Override
    public void originOperation() {
        super.originOperation();
    }

    @Override
    protected void addBehavior() {
        log.info("ConcreteBDecorator addBehavior...");
    }
}
