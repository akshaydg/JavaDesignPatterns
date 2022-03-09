package com.patterns.design.StructuralDesignPatterns.BridgeDesignPattern;

public abstract class Shape {
    //Composition - implementor
    protected Color myColor;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.myColor=c;
    }

    abstract public void applyColor();
}
