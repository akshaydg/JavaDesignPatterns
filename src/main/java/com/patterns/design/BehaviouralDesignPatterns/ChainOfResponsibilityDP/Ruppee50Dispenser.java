package com.patterns.design.BehaviouralDesignPatterns.ChainOfResponsibilityDP;

public class Ruppee50Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" Rs.50 note");
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
