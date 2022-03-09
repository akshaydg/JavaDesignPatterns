package com.patterns.design.BehaviouralDesignPatterns.ObserverPattern;

public class HRDepartment implements IObserver{
    @Override
    public void callMe() {
        System.out.println("HR dept notified");
    }
}
