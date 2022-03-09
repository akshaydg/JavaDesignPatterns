package com.patterns.design.StructuralDesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Composite node
public class Drawing implements Shape{
    //may contain other composite or leaf nodes
    List<Shape> shapes = new ArrayList<>();

    //adding and deleting shapes should be supported
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void deleteShape(Shape shape){
        shapes.remove(shape);
    }

    public void clear(){
        shapes.clear();
    }

    @Override
    public void draw(String color) {
        for (Shape s : shapes){
            s.draw(color);
        }
    }
}
