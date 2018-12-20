package com.yubin.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 商品接口
 *
 * @Author YUBIN
 * @create 2018-12-21
 */
public interface IProduct {
    /**
     * 获取商品的id
     * @return
     */
    Long getId();

    /**
     * 获取商品的名称
     * @return
     */
    String getName();

    /**
     * 获取商品价格
     * @return
     */
    BigDecimal getPrice();
}
