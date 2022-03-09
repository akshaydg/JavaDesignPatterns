package com.patterns.design.CreationalDesignPatterns.AbstractFactoryPattern;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
