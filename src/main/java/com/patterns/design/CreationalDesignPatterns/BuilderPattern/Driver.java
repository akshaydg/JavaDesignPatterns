package com.patterns.design.CreationalDesignPatterns.BuilderPattern;

public class Driver {
    public static void main(String[] args) {
        User user = new User.Builder("akkigg", "akkigg@gmail.com").firstName("Akshay")
                .lastName("Gaikwad").phoneNo(8767778789L).address("Akola").build();

        System.out.println(user);
    }
}
