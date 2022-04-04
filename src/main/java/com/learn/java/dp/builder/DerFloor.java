package com.learn.java.dp.builder;

import java.math.BigDecimal;

/**
 * 德尔
 */
public class DerFloor implements Material {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "德尔集团，专业地板";
    }

    @Override
    public String disPlay() {
        return "scene:" + scene() + ",brand:" + brand() + ",model:" + model() + ",price:" + price() + ",desc:" + desc();
    }
}
