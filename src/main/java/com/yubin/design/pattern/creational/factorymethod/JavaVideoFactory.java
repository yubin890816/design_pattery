package com.yubin.design.pattern.creational.factorymethod;

/**
 * Java视频工厂类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}
