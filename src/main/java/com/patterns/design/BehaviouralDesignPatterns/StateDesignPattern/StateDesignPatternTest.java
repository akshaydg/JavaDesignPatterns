package com.patterns.design.BehaviouralDesignPatterns.StateDesignPattern;

public class StateDesignPatternTest {
    public static void main(String[] args) {
        State tvStartState = new TvStartState();
        State tvStopState = new TvStopState();
        TvContext tvContext1 = new TvContext(tvStartState);
        TvContext tvContext2 = new TvContext(tvStopState);

        tvContext1.doAction();
        tvContext2.doAction();
    }
}
