package com.patterns.design.StructuralDesignPatterns.DecoratorDesignPattern;

public class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;  //to ensure that the child's can use them

    ToppingDecorator(Pizza tempPizza){
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
