package com.yubin.design.pattern.creational.singleton;

/**
 * 懒汉式单例设计模式
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class LazySingleton {

    private LazySingleton() {

    }

    private static volatile LazySingleton lazySingleton;

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}

