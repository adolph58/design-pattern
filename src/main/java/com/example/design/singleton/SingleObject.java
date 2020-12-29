package com.example.design.singleton;

/**
 * @author Arte
 * @create 20-12-29
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello,World!");
    }
}
