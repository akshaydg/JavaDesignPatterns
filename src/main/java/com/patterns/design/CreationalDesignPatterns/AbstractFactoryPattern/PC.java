package com.patterns.design.CreationalDesignPatterns.AbstractFactoryPattern;

public class PC extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
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
        return "PC running";
    }


    @Override
    public String toString() {
        return "PC{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
