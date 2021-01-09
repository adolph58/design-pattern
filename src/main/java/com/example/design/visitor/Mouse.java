package com.example.design.visitor;

/**
 * @author Arte
 * @create 21-1-9
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
