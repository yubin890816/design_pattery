package com.yubin.design.pattern.creational.singleton;

/**
 * 单例设计模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class Test {

    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo();
        ThreadDemo thread2 = new ThreadDemo();
        thread1.start();
        thread2.start();
        System.out.println("program done");
    }
}