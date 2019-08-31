package com.creativepatterns.abstract_factorypattern.example1;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }

    @Override
    public void data() {
        System.out.println("长和宽");
    }
}
