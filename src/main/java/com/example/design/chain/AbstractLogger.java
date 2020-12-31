package com.example.design.chain;

/**
 * @author Arte
 * @create 20-12-31
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if(this.level <= level) {
            writ(message);
        }
        if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void writ(String message);
}
