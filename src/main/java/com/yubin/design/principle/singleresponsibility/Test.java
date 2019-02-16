package com.yubin.design.principle.singleresponsibility;

/**
 * 单一职责原则的测试类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Test {
    public static void main(String[] args) {
        //Bird bird = new Bird();
        //bird.mainMoveMode("大雁");
        //bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveBird("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
