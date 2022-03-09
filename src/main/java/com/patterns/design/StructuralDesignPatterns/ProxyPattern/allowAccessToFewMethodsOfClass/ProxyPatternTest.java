package com.patterns.design.StructuralDesignPatterns.ProxyPattern.allowAccessToFewMethodsOfClass;

public class ProxyPatternTest {
    public static void main(String[] args){
        CommandExecutor executorproxy = new CommandExecutorProxy();
        CommandExecutorImpl executor = new CommandExecutorImpl();
        try
        {
            //note that proxy class is unable to run the command

            /*executorproxy.runCommand("ls -ltr");
            executorproxy.runCommand(" rm -rf abc.pdf");
            */

            executor.runCommand("ls -ltr");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

        executorproxy.validateCommand("ls -lart");
        System.out.println(executorproxy.searchCommand("wish me"));

    }
}
