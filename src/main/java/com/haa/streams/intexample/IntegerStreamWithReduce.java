package com.haa.streams.intexample;

import java.util.stream.Stream;

public class IntegerStreamWithReduce {

    public static void main(String[] args) {

        double total = Stream.of(3.1, 6.5, 2.3, 7.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total); // Total = 19.7
    }
}
