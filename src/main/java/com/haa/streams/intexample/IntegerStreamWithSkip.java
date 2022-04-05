package com.haa.streams.intexample;

import java.util.stream.IntStream;

public class IntegerStreamWithSkip {

    public static void main(String[] args) {

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print); // 6789
        System.out.println();
    }
}
