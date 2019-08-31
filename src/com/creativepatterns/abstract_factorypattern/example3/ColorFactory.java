package com.creativepatterns.abstract_factorypattern.example1;

import com.creativepatterns.abstract_factorypattern.color.Color;
import com.creativepatterns.abstract_factorypattern.shape.Shape;

import java.lang.reflect.InvocationTargetException;

/**
 * @author jjf
 * @version 2019-08-30
 * @decripe ColorFactory工厂类
 */
public class ColorFactory implements AbstractFactory {
    /**
     * 使用此方法后续可能出现 bug
     * @param tClass
     * @param <T>
     * @return
     */
    @Override
    public <T extends Shape> T getShape(Class<T> tClass) {
        return null;
    }

    @Override
    public <T extends Color> T getColor(Class<T> tClass) {
        try {
            return (T)tClass.getDeclaredConstructor().newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e1) {
            e1.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
