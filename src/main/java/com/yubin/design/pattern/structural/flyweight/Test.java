package com.yubin.design.pattern.structural.flyweight;

/**
 * 享元模式测试类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Test {

    private static String[] departments = {"QA", "MA", "SA", "TS"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
