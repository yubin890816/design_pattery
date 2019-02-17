package com.yubin.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂设计模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
