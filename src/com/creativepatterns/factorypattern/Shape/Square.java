package com.creativepatterns.factorypattern;

public class Square implements Shape {
    /**
     * 绘制图形形状
     */
    @Override
    public void draw() {
        System.out.println("正方形");
    }

    /**
     * 图形的颜色
     */
    @Override
    public void color() {
        System.out.println("");
    }
}
