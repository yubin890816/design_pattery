package com.yubin.design.pattern.structural.facade;

/**
 * 积分商品
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class PointsGift {
    // 商品名称
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
