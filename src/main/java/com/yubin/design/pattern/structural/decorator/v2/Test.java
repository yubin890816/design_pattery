package com.yubin.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式测试类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class Test {

    public static void main(String[] args) {
        AHandGrabCake handGrabCake = new HandGrabCake();
        handGrabCake = new EggDecorator(handGrabCake);
        handGrabCake = new EggDecorator(handGrabCake);
        handGrabCake = new SausageDecorator(handGrabCake);
        System.out.println(handGrabCake.getDesc() + " 销售价格:" + handGrabCake.cost());
    }
}
