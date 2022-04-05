package com.learn.java.dp.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcretePrototypeB implements Cloneable {
    private boolean a;
    private String b;

    public ConcretePrototypeB(boolean a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean isA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public ConcretePrototypeA clone() {
        log.info("ConcretePrototypeB clone...");
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("CloneNotSupportedException", e);
        }
        return (ConcretePrototypeA) object;
    }
}
