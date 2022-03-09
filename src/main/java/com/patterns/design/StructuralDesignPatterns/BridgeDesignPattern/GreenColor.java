package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public class GreenColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("green");
    }
}
