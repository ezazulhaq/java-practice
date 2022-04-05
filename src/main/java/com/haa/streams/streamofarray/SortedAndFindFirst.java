package com.haa.streams.streamofarray;

import java.util.stream.Stream;

public class SortedAndFindFirst {

    public static void main(String[] args) {

        Stream.of("Avi", "Anand", "Tushar")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); // Anand
    }
}
