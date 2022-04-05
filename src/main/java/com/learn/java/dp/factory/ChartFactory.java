package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单工厂，负责对象创建，客户端根据传入的参数的不同，创建不同的对象实例（简单工厂模式是工厂方法、抽象工厂的基础，不常用但是
 * 掌握简单工厂便于更好的的理解工厂模式）
 */
@Slf4j
public class ChartFactory {
    public static Chart getChart(String type) {
        if ("histogram".equals(type)) {
            return new HistogramChart();
        } else if ("line".equals(type)) {
            return new LineChart();
        } else if ("pie".equals(type)) {
            return new PieChart();
        }
        return null;
    }
}
