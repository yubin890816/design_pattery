package com.yubin.design.pattern.creational.prototype;

import java.util.Date;

/**
 * 深度克隆和浅度克隆测试类
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig = new Pig("小猪佩奇", new Date(0));
        Pig clonePig = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(clonePig);

        pig.getBirthday().setTime(8888888);
        System.out.println(pig);
        System.out.println(clonePig);
    }
}
