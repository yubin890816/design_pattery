package com.yubin.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 手机商品的实现
 *
 * @Author YUBIN
 * @create 2018-12-21
 */
public class PhoneProduct implements IProduct {

    private Long id;

    private String name;

    private BigDecimal price;

    public PhoneProduct(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
