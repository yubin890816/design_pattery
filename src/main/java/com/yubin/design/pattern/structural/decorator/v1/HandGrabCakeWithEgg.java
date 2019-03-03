package com.yubin.design.pattern.structural.decorator.v1;

/**
 * 手抓饼加鸡蛋
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class HandGrabCakeWithEgg extends HandGrabCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
