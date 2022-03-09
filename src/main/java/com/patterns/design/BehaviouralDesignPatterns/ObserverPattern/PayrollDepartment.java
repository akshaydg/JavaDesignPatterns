package com.patterns.design.BehaviouralDesignPatterns.ObserverPattern;

public class PayrollDepartment implements IObserver{
    @Override
    public void callMe() {
        System.out.println("Payroll dept notified");
    }
}
