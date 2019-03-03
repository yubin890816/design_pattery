package com.yubin.design.pattern.structural.adapter.objectadapter;

/**
 * 对象适配器测试类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcurrentTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
