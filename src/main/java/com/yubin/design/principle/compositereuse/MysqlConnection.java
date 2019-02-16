package com.yubin.design.principle.compositereuse;

/**
 * Mysql连接抽象类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class MysqlConnection extends DBConnection {
    public String getConnection() {
        return "Mysql数据库连接";
    }
}
