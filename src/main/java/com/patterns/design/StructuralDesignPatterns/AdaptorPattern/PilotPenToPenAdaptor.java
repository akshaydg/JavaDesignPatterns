package com.patterns.design.StructuralDesignPatterns.AdaptorPattern;

public class PilotPenToPenAdaptor implements Pen{

    private PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);  //derieving pen's functionality from pilot pen
    }
}
