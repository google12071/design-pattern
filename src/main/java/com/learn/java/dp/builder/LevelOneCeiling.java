package com.learn.java.dp.builder;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 一级吊顶
 */
@Slf4j
public class LevelOneCeiling implements Material {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级吊顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "一级吊顶，一般离顶120-150mm";
    }

    @Override
    public String disPlay() {
        return "scene:" + scene() + ",brand:" + brand() + ",model:" + model() + ",price:" + price() + ",desc:" + desc();
    }
}
