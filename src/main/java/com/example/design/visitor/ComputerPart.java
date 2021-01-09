package com.example.design.visitor;

/**
 * @author Arte
 * @create 21-1-9
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
