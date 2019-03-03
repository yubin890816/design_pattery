package com.yubin.design.pattern.structural.adapter.objectadapter;

/**
 * 对象适配器类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
