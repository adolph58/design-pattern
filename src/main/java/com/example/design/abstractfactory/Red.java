package com.example.design.abstractfactory;

/**
 * @author Arte
 * @create 20-12-28
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
