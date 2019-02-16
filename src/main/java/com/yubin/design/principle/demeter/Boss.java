package com.yubin.design.principle.demeter;

/**
 * 老板相关类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Boss {

    public void commandCheckNumber(Employee employee) {

        employee.checkNumberOfCustomer();
    }
}
