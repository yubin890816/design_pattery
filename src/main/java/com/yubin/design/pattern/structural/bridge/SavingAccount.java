package com.yubin.design.pattern.structural.bridge;

/**
 * 活期账号
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
