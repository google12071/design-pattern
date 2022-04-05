package com.learn.java.dp.factory;

/**
 * 简单工厂模式
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        String type = "histogram";
        Chart chart = ChartFactory.getChart(type);
        System.out.println(chart.getClass().getName());
    }
}
