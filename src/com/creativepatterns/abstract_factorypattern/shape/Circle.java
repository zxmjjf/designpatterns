package com.creativepatterns.abstract_factorypattern.example1;

public class Circle  implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }

    @Override
    public void data() {
        System.out.println("半径");
    }
}
