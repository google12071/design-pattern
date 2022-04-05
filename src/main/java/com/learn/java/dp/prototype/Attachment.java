package com.learn.java.dp.prototype;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 工作周报附件
 */
@Slf4j
public class Attachment implements Serializable {
    /**
     * 附件名称
     */
    private String name;

    public Attachment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 附件下载
     */
    public void download() {
        log.info("attachment download...");
    }
}
