package com.example.design.observer;

/**
 * @author Arte
 * @create 20-12-30
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
