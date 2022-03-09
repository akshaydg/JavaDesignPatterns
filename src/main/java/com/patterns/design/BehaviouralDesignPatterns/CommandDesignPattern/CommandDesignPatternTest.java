package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class CommandDesignPatternTest {
    public static void main(String[] args) {

        ElectronicDevice device = ElectronicDeviceUtil.getElectronicDevice(ElectronicDeviceEnum.TV);
        DeviceButton button = new DeviceButton(new OnCommand(device));
        button.pressButton();

        DeviceButton button1 = new DeviceButton(new UpCommand(device));
        button1.pressButton();

        ElectronicDevice device1 = ElectronicDeviceUtil.getElectronicDevice(ElectronicDeviceEnum.RADIO);
        DeviceButton button2 = new DeviceButton(new OnCommand(device1));
        button2.pressButton();

        DeviceButton button3 = new DeviceButton(new DownCommand(device1));
        button3.pressButton();
    }
}
