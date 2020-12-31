package com.example.design.chain;

/**
 * @author Arte
 * @create 20-12-31
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writ(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
