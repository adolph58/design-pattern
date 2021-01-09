package com.example.design.visitor;

/**
 * @author Arte
 * @create 21-1-9
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
