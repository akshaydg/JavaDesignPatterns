package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class DownCommand implements Command{

    ElectronicDevice device;

    public DownCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
