package com.yubin.design.pattern.creational.prototype.abstractprototype;

/**
 * @Author YUBIN
 * @create 2019-02-23
 */
public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
