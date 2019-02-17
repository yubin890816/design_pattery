package com.yubin.design.pattern.creational.abstractfactory;

/**
 * Python课程工厂实现
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PyhtonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
