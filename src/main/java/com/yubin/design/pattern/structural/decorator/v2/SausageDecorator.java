package com.yubin.design.pattern.structural.decorator.v2;

/**
 * 香肠装饰者类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AHandGrabCake handGrabCake) {
        super(handGrabCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
