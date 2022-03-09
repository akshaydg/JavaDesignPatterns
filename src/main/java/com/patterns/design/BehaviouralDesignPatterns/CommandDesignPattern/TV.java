package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

//RECEIVER IMPL
public class TV implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Tv volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Tv volume down");
    }
}
