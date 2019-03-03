package com.yubin.design.pattern.structural.decorator.v2;

/**
 * 鸡蛋装饰者类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AHandGrabCake handGrabCake) {
        super(handGrabCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
