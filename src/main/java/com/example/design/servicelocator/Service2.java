package com.example.design.servicelocator;

/**
 * @author Arte
 * @create 21-1-15
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
