package com.yubin.design.pattern.creational.prototype.cloneandnew;

/**
 * @Author YUBIN
 * @create 2019-02-23
 */
public class Demo implements Cloneable {

    public Demo() {
        Byte[] bytes = new Byte[1000];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
