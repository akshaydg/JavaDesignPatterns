package com.patterns.design.StructuralDesignPatterns.ProxyPattern.allowAccessToFewMethodsOfClass;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

    @Override
    public boolean validateCommand(String cmd){
        System.out.println("Command validated");
        return !cmd.isEmpty();
    }

    @Override
    public String searchCommand(String task){
        return "Searched Command";
    }
}
