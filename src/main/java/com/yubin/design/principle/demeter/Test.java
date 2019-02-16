package com.yubin.design.principle.demeter;

/**
 * 迪米特法则测试类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Employee employee = new Employee();
        boss.commandCheckNumber(employee);
    }
}
