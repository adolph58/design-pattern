package com.example.design.builder;

/**
 * @author Arte
 * @create 20-12-29
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
