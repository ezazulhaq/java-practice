package com.haa.streams.streamofarray;

import java.util.Arrays;

public class SortedAndFilter {

    public static void main(String[] args) {

        String[] names = { "Avi", "Rupal", "Rani", "John", "Aaradhya", "Suman", "Swarajya" };
        Arrays.stream(names)
                .filter(i -> i.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        /*
         * Output:
         * Suman
         * Swarajya
         */
    }
}
