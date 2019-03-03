package com.yubin.design.pattern.structural.composite;

/**
 * 组合模式测试类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 11);

        CourseCatalog javaCourseCatalog = new CourseCatalog("Java课程目录", 2);
        CatalogComponent mmalCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmalCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPatterb = new Course("Java设计模式", 77);
        javaCourseCatalog.add(mmalCourse1);
        javaCourseCatalog.add(mmalCourse2);
        javaCourseCatalog.add(designPatterb);

        CourseCatalog imoocMainCourseCatalog = new CourseCatalog("慕课网主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);
        imoocMainCourseCatalog.print();
    }
}
