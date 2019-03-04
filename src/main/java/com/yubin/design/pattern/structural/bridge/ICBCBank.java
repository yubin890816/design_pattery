package com.yubin.design.pattern.structural.bridge;

/**
 * 中国工商银行
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
