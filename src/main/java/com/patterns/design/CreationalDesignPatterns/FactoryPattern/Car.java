package com.patterns.design.CreationalDesignPatterns.FactoryPattern;

public class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}
