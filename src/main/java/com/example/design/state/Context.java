package com.example.design.state;

/**
 * @author Arte
 * @create 21-1-8
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
