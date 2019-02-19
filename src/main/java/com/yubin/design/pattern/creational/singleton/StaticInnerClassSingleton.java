package com.yubin.design.pattern.creational.singleton;

/**
 * 静态内部类形式的单例实现
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class StaticInnerClassSingleton {

    // 私有化构造函数
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}