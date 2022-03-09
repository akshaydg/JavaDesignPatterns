package com.patterns.design.BehaviouralDesignPatterns.ChainOfResponsibilityDP;

public class Ruppee10Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" Rs.10 note");
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
