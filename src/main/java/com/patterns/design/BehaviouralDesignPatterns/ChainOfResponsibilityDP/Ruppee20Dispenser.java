package com.patterns.design.BehaviouralDesignPatterns.ChainOfResponsibilityDP;

public class Ruppee20Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" Rs.20 note");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(cur);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain=nextChain;
    }
}
