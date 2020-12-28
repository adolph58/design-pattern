package com.example.design.decorator;

/**
 * @author Arte
 * @create 20-12-28
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setReadBorder(decoratedShape);
    }

    private void setReadBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
