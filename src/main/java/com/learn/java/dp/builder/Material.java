package com.learn.java.dp.builder;

import java.math.BigDecimal;

/**
 * 装修材料抽象（包括吊顶、涂料、地板、地砖、装修明细）
 */
public interface Material {
    /**
     * 装修场景
     *
     * @return
     */
    String scene();

    /**
     * 装修品牌
     *
     * @return
     */
    String brand();

    /**
     * 型号
     *
     * @return
     */
    String model();

    /**
     * 价格
     *
     * @return
     */
    BigDecimal price();

    /**
     * 描述
     *
     * @return
     */
    String desc();

    /**
     * 具体描述
     *
     * @return
     */
    String disPlay();
}
