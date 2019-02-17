package com.yubin.design.pattern.creational.singleton;

/**
 * 线程类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
    }
}