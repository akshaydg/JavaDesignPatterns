package com.patterns.design.CreationalDesignPatterns.SingletonDesignPattern;

public class PeformanceStage {

    private static PeformanceStage INSTANCE;
    private PeformanceStage(){
    }

    public static PeformanceStage getInstance(){
        if(INSTANCE==null){
            INSTANCE = new PeformanceStage();
        }
        return INSTANCE;
    }
}
