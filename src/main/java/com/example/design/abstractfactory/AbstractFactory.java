package com.example.design.abstractfactory;

/**
 * @author Arte
 * @create 20-12-28
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
