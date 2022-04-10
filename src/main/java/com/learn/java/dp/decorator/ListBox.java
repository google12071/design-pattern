package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ListBox extends VisualComponent {
    @Override
    public void display() {
        log.info("ListBox display");
    }
}
