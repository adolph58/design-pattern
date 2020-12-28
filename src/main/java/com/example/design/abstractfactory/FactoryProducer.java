package com.example.design.abstractfactory;

/**
 * @author Arte
 * @create 20-12-28
 */
public class FactoryProducer {

    public static AbstractFactory gatFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
