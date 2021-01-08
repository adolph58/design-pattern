package com.example.design.state;

/**
 * @author Arte
 * @create 21-1-8
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop state";
    }
}
