package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 滚动条装饰器
 */
@Slf4j
public class ScrollBarDecorator extends VisualComponentDecorator {
    public ScrollBarDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.addScrollBar();
    }

    private void addScrollBar() {
        log.info("为构件增加滚动条");
    }
}
