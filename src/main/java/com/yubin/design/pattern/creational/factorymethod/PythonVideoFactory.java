package com.yubin.design.pattern.creational.factorymethod;

/**
 * Python课程工厂类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}
