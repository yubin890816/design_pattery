package com.yubin.design.pattern.structural.flyweight;

/**
 * 经理类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Manager implements Employee {

    // 部门
    private String department;

    // 报告内容
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}
