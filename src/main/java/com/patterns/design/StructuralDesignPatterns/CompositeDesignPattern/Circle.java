package com.patterns.design.StructuralDesignPatterns.CompositeDesignPattern;

//leafs
public class Circle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing Circle with color : "+color);
    }
}
