package com.yubin.design.pattern.structural.facade;

/**
 * 物流子系统
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
