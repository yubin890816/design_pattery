package com.yubin.design.principle.compositereuse;

/**
 * 产品相关类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "插入产品信息");
    }
}
