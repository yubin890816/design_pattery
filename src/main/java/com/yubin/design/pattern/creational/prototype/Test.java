package com.yubin.design.pattern.creational.prototype;

/**
 * 原型模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 5; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("邮件地址" + i);
            mailTemp.setContent("邮件内容" + i);
            MailUtils.sendMail(mailTemp);
        }

        MailUtils.saveOriginMailRecord(mail);
    }
}
