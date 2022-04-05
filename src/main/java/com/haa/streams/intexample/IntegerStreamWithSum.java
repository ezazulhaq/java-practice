package com.haa.streams.intexample;

import java.util.stream.IntStream;

public class IntegerStreamWithSum {

    public static void main(String[] args) {

        int sum = IntStream
                .range(1, 10)
                .sum();
        System.out.println("Sum = " + sum); // Sum = 45
    }
}
