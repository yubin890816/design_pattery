package com.yubin.design.pattern.creational.builder.v2;

/**
 * 建造者模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲课程").buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频").builder();
        System.out.println(course);
    }
}
