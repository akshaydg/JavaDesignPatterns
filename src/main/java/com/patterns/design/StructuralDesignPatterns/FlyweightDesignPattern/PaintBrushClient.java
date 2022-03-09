package com.patterns.design.StructuralDesignPatterns.FlyweightDesignPattern;

public class PaintBrushClient {
    public static void main(String[] args)
    {
        Pen yellowThinPen1 = PenFactory.getThinPen("YELLOW");  //created new pen
        yellowThinPen1.draw("Hello World !!");

        Pen yellowThinPen2 = PenFactory.getThinPen("YELLOW");  //pen is shared
        yellowThinPen2.draw("Hello World !!");

        Pen blueThinPen = PenFactory.getThinPen("BLUE");   //created new pen
        blueThinPen.draw("Hello World !!");

        System.out.println(yellowThinPen1.hashCode());
        System.out.println(yellowThinPen2.hashCode());

        System.out.println(blueThinPen.hashCode());
    }
}
