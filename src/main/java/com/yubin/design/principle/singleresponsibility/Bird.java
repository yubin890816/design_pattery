package com.yubin.design.principle.singleresponsibility;

/**
 * 鸟相关类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
