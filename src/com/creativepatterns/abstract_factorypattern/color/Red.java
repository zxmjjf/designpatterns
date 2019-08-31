package com.creativepatterns.abstract_factorypattern.example1;

public class Red implements Color  {
    @Override
    public void fill() {
        System.out.println("填充红色");
    }
}
