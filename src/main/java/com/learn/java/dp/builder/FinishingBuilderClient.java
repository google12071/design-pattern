package com.learn.java.dp.builder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinishingBuilderClient {
    public static void main(String[] args) {
        FinishingBuilder builder = new FinishingBuilder();
        FinishingDirector director = builder.levelOne(new BigDecimal(132.52).setScale(2, RoundingMode.HALF_UP));
        FinishingModel model = director.getFinishingDetail();
        System.out.println(model);
    }
}
