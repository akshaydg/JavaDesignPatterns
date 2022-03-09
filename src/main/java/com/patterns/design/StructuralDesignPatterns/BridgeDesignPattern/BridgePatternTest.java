package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle(new GreenColor());
        Shape s2 = new Triangle(new RedColor());
        Shape s3 = new Pentagon(new GreenColor());
        Shape s4 = new Pentagon(new RedColor());

        s1.applyColor();
        s2.applyColor();
        s3.applyColor();
        s4.applyColor();
    }
}
