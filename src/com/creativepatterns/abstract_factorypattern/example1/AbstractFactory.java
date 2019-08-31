package com.creativepatterns.abstract_factorypattern.example1;

import com.creativepatterns.abstract_factorypattern.color.Color;
import com.creativepatterns.abstract_factorypattern.shape.Shape;

/**
 * @author jjf
 * @version 2019-08-30
 * @describe 抽象工厂接口，获得具体工厂实例
 */
public interface AbstractFactory {
    /**
     * @describe 泛型方法，获得具体的 <code>Shape对象</code>实例
     * @param tClass
     * @param <T>
     * @return <code>T</code>
     */
    <T extends Shape> T getShape(Class<T> tClass);

    /**
     * @describe 泛型方法，获得具体的 <code>Color对象</code>实例
     * @param tClass
     * @param <T>
     * @return <code>T</code>
     */
    <T extends Color> T getColor(Class<T> tClass);
}
