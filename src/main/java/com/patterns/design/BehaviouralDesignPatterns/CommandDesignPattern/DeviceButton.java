package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

//invoker class
public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
