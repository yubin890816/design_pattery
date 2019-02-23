package com.yubin.design.pattern.creational.prototype;

import java.util.Date;

/**
 * 演示深度克隆和浅度克隆
 *
 * @Author YUBIN
 * @create 2019-02-23
 */
public class Pig implements Cloneable {
    private String name;

    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        if (pig.birthday != null) {
            pig.birthday = (Date) pig.birthday.clone();
        }
        return pig;
    }
}
