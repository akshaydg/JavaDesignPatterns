package com.patterns.design.CreationalDesignPatterns.FactoryPattern;

public class Bus extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Bus engine started");
    }
}
