package com.creativepatterns.factorypattern;

public class Circle implements Shape {
    /**
     * 绘制图形形状
     */
    @Override
    public void draw() {
        System.out.println("圆");
    }

    /**
     * 图形的颜色
     */
    @Override
    public void color() {
        System.out.println("");
    }
}
