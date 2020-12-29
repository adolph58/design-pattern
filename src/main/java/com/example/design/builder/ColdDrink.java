package com.example.design.builder;

/**
 * @author Arte
 * @create 20-12-29
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
