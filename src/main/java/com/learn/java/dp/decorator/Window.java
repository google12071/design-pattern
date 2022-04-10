package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 窗体组件
 */
@Slf4j
public class Window extends VisualComponent {
    @Override
    public void display() {
        log.info("window组件 display");
    }
}
