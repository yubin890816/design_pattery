package com.yubin.design.pattern.structural.bridge;

/**
 * 定期账号类
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
