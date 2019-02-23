package com.yubin.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 发送邮件的工具类
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class MailUtils {

    public static void sendMail(Mail mail) {
        String outputContent = "接收人{0},邮件地址{1},邮件内容{2}";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,originMail:" + mail);
    }
}
