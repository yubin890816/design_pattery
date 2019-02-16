package com.yubin.design.principle.compositereuse;

/**
 * SqlServer数据库连接
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class SqlServerConnection extends DBConnection {
    public String getConnection() {
        return "SqlServer数据库连接";
    }
}
