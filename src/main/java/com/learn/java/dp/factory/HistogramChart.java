package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HistogramChart implements Chart {
    public HistogramChart() {
        log.info("HistogramChart construct");
    }

    @Override
    public void display() {
        log.info("HistogramChart display");
    }
}
