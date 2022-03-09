package com.patterns.design.StructuralDesignPatterns.ProxyPattern.allowAccessToFewMethodsOfClass;

public interface CommandExecutor {
    boolean validateCommand(String cmd);
    String searchCommand(String task);
}
