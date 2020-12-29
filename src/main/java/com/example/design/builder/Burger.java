package com.example.design.builder;

/**
 * @author Arte
 * @create 20-12-29
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
