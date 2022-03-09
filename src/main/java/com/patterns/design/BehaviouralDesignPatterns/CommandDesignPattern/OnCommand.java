package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class OnCommand implements Command{

    ElectronicDevice device;

    public OnCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
