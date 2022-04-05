package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LineChart implements Chart {
    public LineChart() {
        log.info("LineChart construct");
    }

    @Override
    public void display() {
        log.info("LineChart display");
    }
}
