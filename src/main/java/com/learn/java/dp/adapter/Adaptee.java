package com.learn.java.dp.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配者，现有的对象或类，可能不满足客户端的调用，通过适配器类完成适配
 */
@Slf4j
public class Adaptee {
    public void specificMethod() {
        log.info("Adaptee specificMethod invoke...");
    }
}
