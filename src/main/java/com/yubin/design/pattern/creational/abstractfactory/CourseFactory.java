package com.yubin.design.pattern.creational.abstractfactory;

/**
 * 课程相关工厂接口
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public interface CourseFactory {
    public Video getVideo();

    public Article getArticle();
}
