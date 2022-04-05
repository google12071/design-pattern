package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PieChart implements Chart {
    public PieChart() {
        log.info("PieChart construct");
    }

    @Override
    public void display() {
        log.info("PieChart display");
    }
}
