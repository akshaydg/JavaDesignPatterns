package com.patterns.design.StructuralDesignPatterns.DecoratorDesignPattern;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new MozarellaTopping(new JalepanoTopping(new PlainPizza()));
        System.out.println("Pizza desc : "+pizza.getDescription());
        System.out.println("Total cost : "+pizza.getCost());
    }
}
