package com.patterns.design.StructuralDesignPatterns.DecoratorDesignPattern;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Adding handmade dough crust";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of handmade dough crust : "+100.00);
        return 100.00;
    }
}
