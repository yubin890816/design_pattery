package com.yubin.design.pattern.structural.adapter.classadapter;

/**
 * 适配者类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        // ....
        super.adapteeRequest();
        // ....
    }
}
