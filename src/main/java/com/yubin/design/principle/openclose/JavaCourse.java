package com.yubin.design.principle.openclose;

/**
 * Java课程
 *
 * @Author YUBIN
 * @create 2019-02-13
 */
public class JavaCourse implements ICourse {

    private Long id;

    private String name;

    private Double price;

    public JavaCourse() {
    }

    public JavaCourse(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
