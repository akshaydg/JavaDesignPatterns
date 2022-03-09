package com.patterns.design.StructuralDesignPatterns.ProxyPattern.allowAccessToFewMethodsOfClass;

public class CommandExecutorProxy implements CommandExecutor {
    private CommandExecutor executor;

    public CommandExecutorProxy(){
        executor = new CommandExecutorImpl();
    }

    @Override
    public boolean validateCommand(String cmd){
        return executor.validateCommand(cmd);
    }

    @Override
    public String searchCommand(String task){
        return executor.searchCommand(task);
    }
}
