package com.yubin.design.principle.openclose;

/**
 * 测试类
 *
 * @Author YUBIN
 * @create 2018-12-21
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(98L, "java设计模式之开闭原则", 299.00);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println(String.format("课程的id是:%s, 课程的名称是:%s, 课程的打折之后的价格是:%s, 课程的原价是: %s", javaCourse.getId(), javaCourse.getName(), javaCourse.getPrice(), javaCourse.getOriginPrice()));
    }
}
