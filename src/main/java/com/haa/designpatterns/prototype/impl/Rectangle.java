package com.haa.designpatterns.prototype.impl;

import com.haa.designpatterns.prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
