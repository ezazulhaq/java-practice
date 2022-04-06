package com.haa.streams.streamoflist;

import java.util.Arrays;
import java.util.List;

public class StreamAndFilter {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Avi", "Rupal", "Rani", "John", "aaradhya", "Suman", "Swarajya");

        list.stream()
                .map(String::toLowerCase)
                .filter(i -> i.startsWith("a"))
                .forEach(System.out::println);

        /**
         * Output:
         * avi
         * aaradhya
         */
    }
}
