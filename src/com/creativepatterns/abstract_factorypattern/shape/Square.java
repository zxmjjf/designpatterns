package com.creativepatterns.abstract_factorypattern.example1;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }

    @Override
    public void data() {
        System.out.println("正方形的一边长");
    }
}
