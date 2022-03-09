package com.patterns.design.CreationalDesignPatterns.FactoryPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleEnum vehicleEnum){
        switch (vehicleEnum){
            case BUS:
                return new Bus();
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            default:
                return null;
        }
    }
}
