package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰器(实现具体装饰逻辑)
 */
@Slf4j
public class ConcreteADecorator extends Decorator {
    /**
     * 构造器注入
     *
     * @param component
     */
    public ConcreteADecorator(Component component) {
        super(component);
    }

    @Override
    public void originOperation() {
        super.originOperation();
    }

    @Override
    public void addBehavior() {
        log.info("ConcreteADecorator addBehavior...");
        //其他逻辑
        this.anotherThing();
    }

    private void anotherThing() {
        log.info("ConcreteADecorator anotherThing");
    }
}
