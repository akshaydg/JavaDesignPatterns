package com.patterns.design.BehaviouralDesignPatterns.StrategyPattern;

public class Animal {
    private Flys flyable;

    public void setFlyable(Flys flyable) {
        this.flyable = flyable;
    }

    public Animal(Flys flyable){
        this.flyable=flyable;
    }

    public String fly(){
        return flyable.fly();
    }
}

class Dog extends Animal{

    public Dog(Flys flyable) {
        super(flyable);
    }
}

class Bird extends Animal{

    public Bird(Flys flyable) {
        super(flyable);
    }
}
