package com.patterns.design.StructuralDesignPatterns.DecoratorDesignPattern;

public class JalepanoTopping extends ToppingDecorator{
    JalepanoTopping(Pizza pizza) {
        super(pizza);
//        System.out.println("Adding Jalepano");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Jalepano";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Jalepano: " + 20);
        return super.getCost()+20.00;
    }
}
