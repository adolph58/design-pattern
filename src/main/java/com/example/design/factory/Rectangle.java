package com.example.design.factory;

/**
 * @author Arte
 * @create 20-12-28
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
