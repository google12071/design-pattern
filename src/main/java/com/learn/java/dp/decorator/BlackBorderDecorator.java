package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlackBorderDecorator extends VisualComponentDecorator {
    public BlackBorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.addBlackBorder();
    }

    private void addBlackBorder() {
        log.info("为构件增加黑色边框");
    }
}
