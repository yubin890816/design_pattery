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

    // 获取原价
    public Double getOriginPrice() {
        return super.getPrice();
    }

    // 打折之后的价格
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
