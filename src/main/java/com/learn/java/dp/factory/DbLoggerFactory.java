package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DbLoggerFactory implements LoggerFactory {
    @Override
    public Logger getLogger() {
        log.info("create DBLogger...");
        return new DBLogger();
    }

    @Override
    public Logger getLogger(String args) {
        log.info("create DBLogger...,args:{}", args);
        return new DBLogger();
    }

    @Override
    public Logger getLogger(Object object) {
        log.info("create DBLogger...,object:{}", object);
        return new DBLogger();
    }
}
