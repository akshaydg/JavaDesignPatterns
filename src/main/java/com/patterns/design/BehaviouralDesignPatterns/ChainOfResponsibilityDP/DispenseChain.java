package com.patterns.design.BehaviouralDesignPatterns.ChainOfResponsibilityDP;

public interface DispenseChain {
    void dispense(Currency cur);
    void setNextChain(DispenseChain nextChain);
}
