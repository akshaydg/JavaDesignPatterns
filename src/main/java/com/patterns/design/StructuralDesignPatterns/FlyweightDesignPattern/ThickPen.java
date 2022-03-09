package com.patterns.design.StructuralDesignPatterns.FlyweightDesignPattern;

public class ThickPen implements Pen{

    final BrushSize brushSize = BrushSize.THICK; //intrinsic hence final
    private String color = null;
    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THICK "+ content + " in color : "+color);
    }
}
