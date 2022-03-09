package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public class Triangle extends Shape{
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        myColor.applyColor();
    }
}
