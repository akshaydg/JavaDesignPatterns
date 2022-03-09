package com.patterns.design.CreationalDesignPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle(VehicleEnum.BUS);
        Vehicle v2 = VehicleFactory.getVehicle(VehicleEnum.TRUCK);
        Vehicle v3 = VehicleFactory.getVehicle(VehicleEnum.CAR);

        v1.startEngine();
        v2.startEngine();
        v3.startEngine();
    }
}
