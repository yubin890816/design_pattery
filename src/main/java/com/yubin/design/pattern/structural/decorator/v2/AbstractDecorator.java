package com.yubin.design.pattern.structural.decorator.v2;

/**
 * 抽象装饰者类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public abstract class AbstractDecorator extends AHandGrabCake {

    private AHandGrabCake handGrabCake;

    public AbstractDecorator(AHandGrabCake handGrabCake) {
        this.handGrabCake = handGrabCake;
    }

    @Override
    public String getDesc() {
        return this.handGrabCake.getDesc();
    }

    @Override
    public int cost() {
        return this.handGrabCake.cost();
    }
}
