package com.yubin.design.pattern.structural.bridge;

/**
 * 桥接模式测试类
 *
 * @Author YUBIN
 * @create 2019-03-04
 */
public class Test {

    public static void main(String[] args) {
        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        Bank icbcBank1 = new ICBCBank(new SavingAccount());
        Account icbcAccount1 = icbcBank1.openAccount();
        icbcAccount1.showAccountType();

        Bank icbcBank2 = new ICBCBank(new DepositAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();
    }
}
