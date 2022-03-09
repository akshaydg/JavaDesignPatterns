package com.patterns.design.CreationalDesignPatterns.AbstractFactoryPattern;

public abstract class Computer {
    //with abstract methods, these variables cannot be accesed in subclasses, so add them in subclasses
    /*private String ram;
    private static String hdd;
    private final String cpu = "INTEL";
    private static final String motherBoard = "ASUS";*/

    abstract String getRam();
    abstract String getHdd();
    abstract String getCpu();
    abstract String run();
}
