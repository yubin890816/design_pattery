package com.yubin.design.pattern.creational.simplefactory;

/**
 * 简单工厂测试类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Test {

    public static void main(String[] args) {
        //VideoFactory videoFactory = new VideoFactory();
        //Video video = videoFactory.getVideo("python");
        //if (video == null) {
        //    return;
        //}
        //video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
