package com.yubin.design.pattern.creational.factorymethod;

/**
 * 工厂方法测试类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        javaVideoFactory.getVideo().produce();

        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().produce();
    }
}
