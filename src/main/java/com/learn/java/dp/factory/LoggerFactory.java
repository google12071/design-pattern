package com.learn.java.dp.factory;

/***
 * 日志工厂
 */
public interface LoggerFactory {
    Logger getLogger();

    Logger getLogger(String args);

    Logger getLogger(Object object);
}
