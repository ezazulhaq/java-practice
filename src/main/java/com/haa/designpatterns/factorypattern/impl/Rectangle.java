package com.haa.designpatterns.factorypattern.impl;

import com.haa.designpatterns.factorypattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
