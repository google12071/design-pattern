package com.learn.java.dp.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * Java中通过实现Cloneable类完成对象拷贝，默认为浅拷贝，引用类型仅拷贝地址
 */
@Slf4j
public class ConcretePrototypeA implements Cloneable {
    private int a;
    private int b;
    private ObjectReference reference;

    public ConcretePrototypeA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setReference(ObjectReference reference) {
        this.reference = reference;
    }

    public ObjectReference getReference() {
        return reference;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public ConcretePrototypeA clone() {
        log.info("ConcretePrototypeA clone...");
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("CloneNotSupportedException", e);
        }
        return (ConcretePrototypeA) object;
    }
}
