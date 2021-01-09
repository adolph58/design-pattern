package com.example.design.visitor;

/**
 * @author Arte
 * @create 21-1-9
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVistor());
    }
}
