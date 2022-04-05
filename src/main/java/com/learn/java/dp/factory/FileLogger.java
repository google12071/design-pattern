package com.learn.java.dp.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 文件日志
 */
@Slf4j
public class FileLogger implements Logger {
    private String args;
    private Object object;

    public FileLogger() {
    }

    public FileLogger(String args) {
        this.args = args;
    }

    public FileLogger(Object object) {
        this.object = object;
    }

    @Override
    public void writeLog() {
        log.info("write log to file...");
    }
}
