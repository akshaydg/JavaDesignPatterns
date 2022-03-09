package com.patterns.design.BehaviouralDesignPatterns.CommandDesignPattern;

public class ElectronicDeviceUtil {

    public static ElectronicDevice getElectronicDevice(ElectronicDeviceEnum deviceEnum){
        switch (deviceEnum){
            case TV:
                return new TV();
            case RADIO:
                return new Radio();
            default:
                return null;
        }
    }
}
