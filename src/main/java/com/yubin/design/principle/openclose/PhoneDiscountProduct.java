package com.yubin.design.principle.openclose;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 手机商品的子类
 *
 * @Author YUBIN
 * @create 2018-12-21
 */
public class PhoneDiscountProduct extends PhoneProduct {
    public PhoneDiscountProduct(Long id, String name, BigDecimal price) {
        super(id, name, price);
    }

    /**
     * 获取手机商品的原价
     * @return
     */
    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8")).setScale(2, RoundingMode.HALF_DOWN);
    }
}
