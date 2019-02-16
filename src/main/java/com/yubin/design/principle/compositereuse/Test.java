package com.yubin.design.principle.compositereuse;

/**
 * 合成(组合)/复用原则测试类
 *
 * @Author YUBIN
 * @create 2019-02-16
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        //productDao.setDbConnection(new MysqlConnection());
        productDao.setDbConnection(new SqlServerConnection());
        productDao.addProduct();
    }
}
