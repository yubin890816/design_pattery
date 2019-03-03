package com.yubin.design.pattern.structural.adapter.classadapter;

/**
 * 目标接口其中一个实现类（演示用）
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class ConcurrentTarget implements Target {
    public void request() {
        System.out.println("ConcurrentTarget 目标方法被调用了");
    }
}
