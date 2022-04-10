package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 装饰者模式，通过抽象装饰器，扩展原有对象行为，对象扩展逻辑，对客户端透明
 */
@Slf4j
public class DecoratorClient {
    public static void main(String[] args) {
        Component componentA = new ConcreteADecorator(new ConcreteAComponent());
        componentA.originOperation();

        Component componentB = new ConcreteBDecorator(new ConcreteAComponent());
        componentB.originOperation();
    }
}
