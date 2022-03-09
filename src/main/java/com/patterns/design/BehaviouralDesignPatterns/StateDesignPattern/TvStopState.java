package com.patterns.design.BehaviouralDesignPatterns.StateDesignPattern;

public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("Tv Off State");
    }
}
