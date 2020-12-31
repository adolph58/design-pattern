package com.example.design.chain;

/**
 * @author Arte
 * @create 20-12-31
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writ(String message) {
        System.out.println("File::Logger: " + message);
    }
}
