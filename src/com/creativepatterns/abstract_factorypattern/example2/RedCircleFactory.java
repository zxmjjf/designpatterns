package com.creativepatterns.abstract_factorypattern.example2;

import com.creativepatterns.abstract_factorypattern.color.Color;
import com.creativepatterns.abstract_factorypattern.shape.Shape;

public class RedCircleFactory implements AbstractFactory {

    /**
     * @return <code>shape</code>
     * @descride
     */
    @Override
    public Shape getShape() {
        return null;
    }

    /**
     * @return <code>Color</code>
     * @descride 生产原料
     */
    @Override
    public Color getColor() {
        return null;
    }
}
