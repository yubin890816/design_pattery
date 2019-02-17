package com.yubin.design.pattern.creational.simplefactory;

/**
 * 视频相关工厂类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class VideoFactory {

    public Video getVideo(Class clazz) {
        //if ("java".equalsIgnoreCase(type)) {
        //    return new JavaVideo();
        //} else if ("python".equalsIgnoreCase(type)) {
        //    return new PythonVideo();
        //}
        //return null;
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
