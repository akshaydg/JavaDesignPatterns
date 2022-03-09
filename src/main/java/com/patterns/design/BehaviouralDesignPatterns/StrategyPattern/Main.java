package com.patterns.design.BehaviouralDesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(new CantFly());
        Animal animal2 = new Bird(new ItFlys());

        System.out.println("Dog : "+animal1.fly());
        System.out.println("Bird : "+animal2.fly());

        System.out.println("After flying training to dog...");
        animal1.setFlyable(new ItFlys());
        System.out.println("Dog : "+animal1.fly());
    }
}
