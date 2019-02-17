package com.yubin.design.pattern.creational.builder;

/**
 * 构建课程抽象类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public abstract class CourseBuilder {
    // 构建课程名称
    public abstract void buildCourseName(String courseName);

    // 构建课程PPT
    public abstract void buildCoursePPT(String coursePPT);

    // 构建课程视频
    public abstract void buildCourseVideo(String courseVideo);

    // 构建课程手记
    public abstract void buildCourseArticle(String courseArticle);

    // 构建课程Q&A
    public abstract void buildCourseQA(String courseQA);

    // 制作课程
    public abstract Course makeCourse();
}
