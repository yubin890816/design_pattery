package com.yubin.design.pattern.structural.bridge;

/**
 * 中国农业银行
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
