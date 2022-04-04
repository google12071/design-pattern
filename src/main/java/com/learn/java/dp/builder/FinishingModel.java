package com.learn.java.dp.builder;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 装修风格描述
 */
@Data
public class FinishingModel {
    /**
     * 装修style
     */
    private String style;

    /**
     * 装修总价
     */
    private BigDecimal totalPrice;

    /**
     * 装修面积
     */
    private BigDecimal area;

    /**
     * 装修描述
     */
    private String desc;
}
