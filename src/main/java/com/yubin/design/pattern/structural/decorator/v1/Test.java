package com.yubin.design.pattern.structural.decorator.v1;

/**
 * 测试类
 *
 * @Author YUBIN
 * @create 2019-03-02
 */
public class Test {

    public static void main(String[] args) {
        HandGrabCake handGrabCake = new HandGrabCake();
        System.out.println(handGrabCake.getDesc() + " 销售价格:" + handGrabCake.cost());

        HandGrabCake handGrabCakeWithEgg = new HandGrabCakeWithEgg();
        System.out.println(handGrabCakeWithEgg.getDesc() + " 销售价格:" + handGrabCakeWithEgg.cost());

        HandGrabCake handGrabCakeWithSausage = new HandGrabCakeWithSausage();
        System.out.println(handGrabCakeWithSausage.getDesc() + " 销售价格:" + handGrabCakeWithSausage.cost());
    }
}
