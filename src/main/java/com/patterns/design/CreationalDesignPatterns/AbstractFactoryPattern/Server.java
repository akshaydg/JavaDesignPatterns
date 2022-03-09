package com.patterns.design.CreationalDesignPatterns.AbstractFactoryPattern;

public class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getRam() {
        return ram;
    }

    @Override
    String getHdd() {
        return hdd;
    }

    @Override
    String getCpu() {
        return cpu;
    }

    @Override
    String run() {
        return "Server running";
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
