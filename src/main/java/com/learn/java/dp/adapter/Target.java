package com.learn.java.dp.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 封装适配器类，内部兼容转换逻辑对调用者透明
 */
@Slf4j
public abstract class Target {
    protected abstract void request();
}
