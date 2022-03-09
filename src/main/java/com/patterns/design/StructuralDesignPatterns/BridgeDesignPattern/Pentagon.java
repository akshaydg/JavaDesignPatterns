package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public class Pentagon extends Shape{
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        myColor.applyColor();
    }
}
