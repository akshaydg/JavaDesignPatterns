package com.patterns.design.StructuralDesignPatterns.AdaptorPattern;

public class Main {
    public static void main(String[] args) {
        //we didn't have a impl class for pen, but we had a class PilotPen...
        // So PilotPenToPenAdaptor converts the PilotPen class behaviour to Pen
        PilotPenToPenAdaptor p = new PilotPenToPenAdaptor(); //Adaptor class
        AssignmentWork aw = new AssignmentWork(p);
        aw.writeAssignment("Writing assignment");
    }
}
