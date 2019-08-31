package com.creativepatterns.factorypattern;

public class Rectangle implements Shape {

    /**
     * 绘制图形形状
     */
    @Override
    public void draw() {
        System.out.println("矩形");
    }

    /**
     * 图形的颜色
     */
    @Override
    public void color() {
        System.out.println("");
    }
}
