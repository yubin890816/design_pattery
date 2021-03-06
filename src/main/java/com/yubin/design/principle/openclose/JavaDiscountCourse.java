package com.yubin.design.principle.openclose;

/**
 * java课程子类
 *
 * @Author YUBIN
 * @create 2019-02-13
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Long id, String name, Double price) {
        super(id, name, price);
    }

    // 获取打折价格
    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
