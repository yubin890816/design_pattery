package com.yubin.design.pattern.structural.facade;

/**
 * 积分支付子系统
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
