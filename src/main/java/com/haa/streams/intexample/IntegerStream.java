package com.haa.streams.intexample;

import java.util.stream.IntStream;

public class IntegerStream {

    public static void main(String[] args) {

        IntStream
                .range(1, 10)
                .forEach(System.out::print); // 123456789
        System.out.println();
    }

}
