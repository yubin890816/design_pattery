package com.yubin.design.pattern.structural.adapter;

/**
 * 适配器类（将220V的交流电转换成5V的直流电）
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class PowerAdapter implements DC5 {

    AC220 ac220 = new AC220();

    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出:" + adapterOutput + "V");
        return adapterOutput;
    }
}
