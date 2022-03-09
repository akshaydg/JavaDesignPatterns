package com.patterns.design.CreationalDesignPatterns.AbstractFactoryPattern;

public class ComputerClient {
    public static void main(String[] args) {
        Computer computer1 = ComputerFactory.createComputer(new PCFactory("2gb", "500gb", "i3"));
        Computer computer2 = ComputerFactory.createComputer(new ServerFactory("50gb", "10000gb", "i7"));

        System.out.println(computer1.run());;
        System.out.println(computer2.run());;

    }
}
