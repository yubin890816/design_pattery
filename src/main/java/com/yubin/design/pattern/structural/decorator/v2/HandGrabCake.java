package com.yubin.design.pattern.structural.decorator.v2;

/**
 * 手抓饼实体类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class HandGrabCake extends AHandGrabCake {
    public String getDesc() {
        return "手抓饼";
    }

    public int cost() {
        return 5;
    }
}
