package com.learn.java.dp.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器，解决适配者接口不兼容的问题
 */
@Slf4j
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        log.info("adapter exchange...");
        adaptee.specificMethod();
    }
}
