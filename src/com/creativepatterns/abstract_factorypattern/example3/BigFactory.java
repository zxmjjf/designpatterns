package com.creativepatterns.abstract_factorypattern.example1;

import java.lang.reflect.InvocationTargetException;

/**
 * @author jjf
 * @version 2019-08-30
 * @descripe 创建具体工厂的类， BigFactory + AbstractFactory 是抽象工厂模式的核心
 *           是工厂模式的外壳
 */
public class BigFactory {

    public static <T extends AbstractFactory> T getFactory(Class<T> tClass) {
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
