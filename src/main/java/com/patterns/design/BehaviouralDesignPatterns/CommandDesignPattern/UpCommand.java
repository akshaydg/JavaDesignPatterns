package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class UpCommand implements Command{

    ElectronicDevice device;

    public UpCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}
