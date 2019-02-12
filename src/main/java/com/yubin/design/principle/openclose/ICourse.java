package com.yubin.design.principle.openclose;

/**
 * 课程接口
 *
 * @Author YUBIN
 * @create 2019-02-13
 */
public interface ICourse {

    // 获取课程的id
    Long getId();

    // 获取课程的名称
    String getName();

    // 获取课程的价格
    Double getPrice();
}
