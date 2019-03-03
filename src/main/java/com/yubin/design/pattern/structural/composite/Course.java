package com.yubin.design.pattern.structural.composite;

/**
 * 课程相关类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Course extends CatalogComponent {
    // 课程名称
    private String name;

    // 课程价格
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " price:" + price);
    }
}
