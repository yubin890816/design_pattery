package com.yubin.design.pattern.structural.facade;

/**
 * 库存校验,积分校验子系统
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存满足");
        return true;
    }
}
