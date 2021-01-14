package com.example.design.interceptingfilter;

/**
 * @author Arte
 * @create 21-1-14
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
