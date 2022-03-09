package com.patterns.design.StructuralDesignPatterns.ProxyPattern.controlledAccessToAMethod;

public interface CommandExecutor {
    public void runCommand(String cmd) throws Exception;
}
