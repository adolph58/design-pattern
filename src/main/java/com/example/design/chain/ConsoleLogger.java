package com.example.design.chain;

/**
 * @author Arte
 * @create 20-12-31
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writ(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
