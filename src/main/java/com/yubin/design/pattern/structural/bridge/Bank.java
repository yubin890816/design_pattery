package com.yubin.design.pattern.structural.bridge;

/**
 * 银行抽象类
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
