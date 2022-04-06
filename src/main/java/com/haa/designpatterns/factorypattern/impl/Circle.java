package com.haa.designpatterns.factorypattern.impl;

import com.haa.designpatterns.factorypattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
