package com.haa.designpatterns.singleton;

public class SingleTonPatternDemo {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.err.println("Object1 = " + singleTon + "and Object2 = " + singleTon2);
    }
}
