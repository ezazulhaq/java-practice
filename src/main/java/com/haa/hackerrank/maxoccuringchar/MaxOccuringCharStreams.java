package com.haa.hackerrank.maxoccuringchar;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOccuringCharStreams {
    public static void main(String[] args) {

        System.out.println("Maximum Occuring Character Using Stream - " + getMaxOccuringCharUsingStream("abbaacbc"));

    }

    private static String getMaxOccuringCharUsingStream(String str) {
        return Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max((i, j) -> i.getValue().compareTo(j.getValue()))
                .get()
                .getKey();
    }
}
