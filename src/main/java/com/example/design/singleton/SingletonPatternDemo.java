package com.example.design.singleton;

/**
 * @author Arte
 * @create 20-12-29
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
