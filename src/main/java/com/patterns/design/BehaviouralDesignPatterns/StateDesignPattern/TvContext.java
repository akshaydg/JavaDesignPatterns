package com.patterns.design.BehaviouralDesignPatterns.StateDesignPattern;

public class TvContext {
    private State state;

    public TvContext(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction();
    }
}
