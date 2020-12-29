package com.example.design.builder;

/**
 * @author Arte
 * @create 20-12-29
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
