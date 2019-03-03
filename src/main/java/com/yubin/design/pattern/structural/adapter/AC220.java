package com.yubin.design.pattern.structural.adapter;

/**
 * 220V的交流电 被适配者类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
