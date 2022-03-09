package com.patterns.design.StructuralDesignPatterns.DecoratorDesignPattern;

public class MozarellaTopping extends ToppingDecorator{
    MozarellaTopping(Pizza tempPizza) {
        super(tempPizza);
//        System.out.println("Adding Mozarella cheese");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Mozzarella";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Mozzarella: " + 40);
        return super.getCost()+40.00;
    }
}
