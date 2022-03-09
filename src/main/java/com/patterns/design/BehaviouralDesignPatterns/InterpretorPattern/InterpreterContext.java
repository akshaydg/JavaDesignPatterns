package com.patterns.design.BehaviouralDesignPatterns.InterpretorPattern;

//main conversion/interpreter class
public class InterpreterContext {

    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}

