package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据库日志
 */
@Slf4j
public class DBLogger implements Logger {
    @Override
    public void writeLog() {
        log.info("write log to db...");
    }
}
