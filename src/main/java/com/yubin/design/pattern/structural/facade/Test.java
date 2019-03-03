package com.yubin.design.pattern.structural.facade;

/**
 * 外观模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("iphone");
        GiftExchangeService exchangeService = new GiftExchangeService();
        exchangeService.giftExchange(pointsGift);
    }
}
