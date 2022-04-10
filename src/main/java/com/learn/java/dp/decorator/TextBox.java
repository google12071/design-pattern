package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 文本框
 */
@Slf4j
public class TextBox extends VisualComponent {
    @Override
    public void display() {
        log.info("TextBox组件显示");
    }
}
