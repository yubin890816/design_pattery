package com.yubin.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录类
 *
 * @Author YUBIN
 * @create 2019-03-03
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();

    // 目录名称
    private String name;

    // 目录等级
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
