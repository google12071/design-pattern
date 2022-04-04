package com.learn.java.dp.builder;

import java.math.BigDecimal;

/**
 * 马可波罗
 */
public class MarcoPoloTile implements Material {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "默认";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "马可波罗瓷砖，国际认证";
    }

    @Override
    public String disPlay() {
        return "scene:" + scene() + ",brand:" + brand() + ",model:" + model() + ",price:" + price() + ",desc:" + desc();
    }
}
