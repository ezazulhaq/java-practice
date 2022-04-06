package com.haa.designpatterns.factorypattern;

import com.haa.designpatterns.factorypattern.impl.Circle;
import com.haa.designpatterns.factorypattern.impl.Rectangle;
import com.haa.designpatterns.factorypattern.impl.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
