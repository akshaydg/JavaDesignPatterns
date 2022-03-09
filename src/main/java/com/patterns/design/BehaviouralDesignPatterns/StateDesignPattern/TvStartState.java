package com.patterns.design.BehaviouralDesignPatterns.StateDesignPattern;

public class TvStartState implements State{
    @Override
    public void doAction() {
        System.out.println("Tv On State");
    }
}
