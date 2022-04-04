package com.learn.java.dp.builder;

import java.math.BigDecimal;

/**
 * 立邦
 */
public class LiBangCoat implements Material {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立邦涂料，绿色环保";
    }

    @Override
    public String disPlay() {
        return "scene:" + scene() + ",brand:" + brand() + ",model:" + model() + ",price:" + price() + ",desc:" + desc();
    }
}
