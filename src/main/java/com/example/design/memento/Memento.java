package com.example.design.memento;

/**
 * @author Arte
 * @create 21-1-7
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
