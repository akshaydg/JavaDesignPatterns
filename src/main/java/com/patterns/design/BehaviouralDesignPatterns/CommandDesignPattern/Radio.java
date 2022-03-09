package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

//RECEIVER IMPL
public class Radio implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Radio On");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio volume down");
    }
}
