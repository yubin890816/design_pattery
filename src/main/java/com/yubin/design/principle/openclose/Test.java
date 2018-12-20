package com.yubin.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 测试类
 *
 * @Author YUBIN
 * @create 2018-12-21
 */
public class Test {
    public static void main(String[] args) {
        IProduct iproduct = new PhoneDiscountProduct(23L, "iphoneX", new BigDecimal("3999"));
        PhoneDiscountProduct product = (PhoneDiscountProduct) iproduct;
        System.out.println(String.format("商品的id是:%s, 商品的名称是:%s, 商品的打折价是:%s, 商品的原价是:%s", product.getId(), product.getName(), product.getPrice(), product.getOriginPrice()));
    }
}
