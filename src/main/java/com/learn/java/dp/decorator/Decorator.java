package com.learn.java.dp.decorator;

/**
 * 装饰器
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 原始操作
     */
    @Override
    public void originOperation() {
        //原始操作
        component.originOperation();
        //增加行为，包装原组件类
        addBehavior();
    }

    protected abstract void addBehavior();
}
