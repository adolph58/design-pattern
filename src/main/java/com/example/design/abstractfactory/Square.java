package com.example.design.abstractfactory;

/**
 * @author Arte
 * @create 20-12-28
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
