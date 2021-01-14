package com.example.design.interceptingfilter;

/**
 * @author Arte
 * @create 21-1-14
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
