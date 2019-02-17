package com.yubin.design.pattern.creational.abstractfactory;

/**
 * Java课程工厂实现类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
