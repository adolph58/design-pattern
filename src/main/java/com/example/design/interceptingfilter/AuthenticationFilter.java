package com.example.design.interceptingfilter;

/**
 * @author Arte
 * @create 21-1-14
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
