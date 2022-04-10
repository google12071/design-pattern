package com.learn.java.dp.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体组件类
 */
@Slf4j
public class ConcreteAComponent implements Component {
    /**
     * 原始操作
     */
    @Override
    public void originOperation() {
        log.info("ConcreteAComponent originOperation...");
    }
}
