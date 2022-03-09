package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("red");
    }
}
