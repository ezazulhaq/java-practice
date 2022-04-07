package com.haa.designpatterns.prototype.impl;

import com.haa.designpatterns.prototype.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
