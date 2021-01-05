package com.example.design.facade;

/**
 * @author Arte
 * @create 21-1-5
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
