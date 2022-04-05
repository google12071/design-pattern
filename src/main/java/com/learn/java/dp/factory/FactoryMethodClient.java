package com.learn.java.dp.factory;

import com.learn.java.dp.util.XmlUtil;

/**
 * 工厂方法模式：
 * 抽象产品工厂、产品
 * 具体工厂与具体产品一一对应
 * 重载工厂方法满足不同的创建对象需求
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        //配置文件读取，切换对客户端无感知
        LoggerFactory factory = (LoggerFactory) XmlUtil.getBean("src/main/resources/factoryBean.xml");
        Logger fileLogger = factory.getLogger();
        fileLogger.writeLog();
    }
}
