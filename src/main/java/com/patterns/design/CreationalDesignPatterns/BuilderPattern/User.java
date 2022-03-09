package com.patterns.design.CreationalDesignPatterns.BuilderPattern;

public class User {

    //Required
    private String userName;
    private String emailAddress;

    //Optional
    private String firstName;
    private String lastName;
    private long phoneNo;
    private String address;

    private User(Builder builder){
        this.userName=builder.userName;
        this.emailAddress= builder.emailAddress;
        this.lastName=builder.lastName;
        this.phoneNo=builder.phoneNo;
        this.address= builder.address;
    }

    static class Builder{
        private String userName;
        private String emailAddress;

        //Optional
        private String firstName;
        private String lastName;
        private long phoneNo;
        private String address;

        Builder(String userName, String emailAddress){
            this.userName=userName;
            this.emailAddress=emailAddress;
        }

        Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        Builder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        Builder phoneNo(long phoneNo){
            this.phoneNo=phoneNo;
            return this;
        }
        Builder address(String address){
            this.address=address;
            return this;
        }

        User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo=" + phoneNo +
                ", address='" + address + '\'' +
                '}';
    }
}
