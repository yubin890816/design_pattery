package com.yubin.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例实现
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class HungrySingleton implements Serializable {

    // 私有化构造函数
    private HungrySingleton() {

    }

    private static final HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
