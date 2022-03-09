package com.patterns.design.BehaviouralDesignPatterns.ChainOfResponsibilityDP;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain chain;

    public ATMDispenseChain() {
        this.chain = new Ruppee50Dispenser();
        DispenseChain chain2 = new Ruppee20Dispenser();
        DispenseChain chain3 = new Ruppee10Dispenser();

        this.chain.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.chain.dispense(new Currency(amount));
        }

    }
}
