package com.yubin.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 职员相关类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Employee {

    public void checkNumberOfCustomer() {
        List<Customer> customerList = new ArrayList<Customer>();
        for (int i = 0; i < 20; i++) {
            Customer customer = new Customer();
            customerList.add(customer);
        }
        System.out.println("客户的数量是:" + customerList.size());
    }
}
