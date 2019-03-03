package com.yubin.design.pattern.structural.decorator.v1;

/**
 * 手抓饼加香肠
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class HandGrabCakeWithSausage extends HandGrabCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
