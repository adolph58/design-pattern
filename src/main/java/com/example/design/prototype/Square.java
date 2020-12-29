package com.example.design.prototype;

/**
 * @author Arte
 * @create 2020/12/29.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

