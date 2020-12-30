package com.example.design.strategy;

/**
 * @author Arte
 * @create 20-12-30
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStragegy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
