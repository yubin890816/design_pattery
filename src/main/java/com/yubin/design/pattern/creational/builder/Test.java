package com.yubin.design.pattern.creational.builder;

/**
 * 建造者模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makerCourse("Java设计模式精讲课程", "Java设计模式精讲PPT",
                "Java设计模式精讲视频", "Java设计模式精讲手记", "Java设计模式精讲QA");
        System.out.println(course);
    }
}
