package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建文件Logger工厂
 */
@Slf4j
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger getLogger() {
        log.info("create FileLogger...");
        return new FileLogger();
    }

    @Override
    public Logger getLogger(String args) {
        log.info("create FileLogger...,args:{}", args);
        return new FileLogger(args);
    }

    @Override
    public Logger getLogger(Object object) {
        log.info("create FileLogger...,object:{}", object);
        return new FileLogger(object);
    }
}
