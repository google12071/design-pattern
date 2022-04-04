package com.learn.java.dp.builder;

import java.math.BigDecimal;

/*
 *  二级吊顶
 */
public class LevelTwoCeiling implements Material {
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
        return "二级吊顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "二级吊顶，一般下吊20cm";
    }

    @Override
    public String disPlay() {
        return "scene:" + scene() + ",brand:" + brand() + ",model:" + model() + ",price:" + price() + ",desc:" + desc();
    }
}
