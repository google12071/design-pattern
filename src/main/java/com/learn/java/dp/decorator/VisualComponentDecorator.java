package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VisualComponentDecorator extends VisualComponent {
    /**
     * 引用组件抽象
     */
    private VisualComponent component;

    /**
     * 构造器注入
     *
     * @param component
     */
    public VisualComponentDecorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
