package com.patterns.design.StructuralDesignPatterns.AdaptorPattern;

public class AssignmentWork {

    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    AssignmentWork(Pen pen){
        this.pen=pen;
    }

    public void writeAssignment(String str){
        pen.write(str);
    }
}
