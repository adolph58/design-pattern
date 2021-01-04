package com.example.design.bridge;

/**
 * @author Arte
 * @create 21-1-4
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
