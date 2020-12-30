package com.example.design.strategy;

/**
 * @author Arte
 * @create 20-12-30
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
