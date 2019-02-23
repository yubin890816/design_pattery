package com.yubin.design.pattern.creational.prototype.cloneandnew;

/**
 * clone方法和new性能比较测试类
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class Test {

    private static final int COUNT = 10000;

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew();
        testClone();
    }

    private static void testNew() {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            Demo demo = new Demo();
        }
        long end = System.nanoTime();
        System.out.println("testNew  耗时:" + (end - start));
    }

    private static void testClone() throws CloneNotSupportedException {
        long start = System.nanoTime();
        Demo demo = new Demo();
        for (int i = 0; i < COUNT; i++) {
            Demo demo1 = (Demo) demo.clone();
        }
        long end = System.nanoTime();
        System.out.println("testClone耗时:" + (end - start));
    }
}
