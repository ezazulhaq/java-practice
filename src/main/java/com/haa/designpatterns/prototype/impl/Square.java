package com.haa.designpatterns.prototype.impl;

import com.haa.designpatterns.prototype.Shape;

public class Square extends Shape {

    public Square() {
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
