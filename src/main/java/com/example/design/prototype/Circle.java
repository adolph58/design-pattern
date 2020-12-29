package com.example.design.prototype;

/**
 * @author Arte
 * @create 2020/12/29.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

