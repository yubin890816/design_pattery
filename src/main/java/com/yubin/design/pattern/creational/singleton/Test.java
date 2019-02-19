package com.yubin.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例设计模式测试类
 *
 * @Author YUBIN
 * @create 2019-02-17
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //ThreadDemo thread1 = new ThreadDemo();
        //ThreadDemo thread2 = new ThreadDemo();
        //thread1.start();
        //thread2.start();
        //System.out.println("program done");

        //HungrySingleton instance = HungrySingleton.getInstance();
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        //oos.writeObject(instance);
        //
        //File file = new File("singleton_file");
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        //
        //System.out.println(instance);
        //System.out.println(newInstance);
        //System.out.println(instance == newInstance);

        Class objectClass = StaticInnerClassSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}