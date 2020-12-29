package com.example.design.builder;

/**
 * @author Arte
 * @create 20-12-29
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
