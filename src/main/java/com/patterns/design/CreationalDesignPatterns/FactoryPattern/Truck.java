package com.patterns.design.CreationalDesignPatterns.FactoryPattern;

public class Truck extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Truck engine started");
    }
}
