package com.yubin.design.pattern.structural.adapter;

/**
 * 测试类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
