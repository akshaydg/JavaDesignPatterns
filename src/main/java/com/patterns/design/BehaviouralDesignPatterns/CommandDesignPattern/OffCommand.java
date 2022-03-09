package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class OffCommand implements Command{

    ElectronicDevice device;

    public OffCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
