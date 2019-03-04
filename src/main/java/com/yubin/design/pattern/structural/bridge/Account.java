package com.yubin.design.pattern.structural.bridge;

/**
 * 账号接口
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public interface Account {

    // 打开账号
    Account openAccount();

    // 显示账号类型
    void showAccountType();
}
