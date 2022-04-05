package com.haa.streams.streamofarray;

import java.util.Arrays;

public class AverageOfSquaresOfIntArray {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8 };
        Arrays.stream(arr)
                .map(i -> i * i)
                .average()
                .ifPresent(System.out::println); // 30.0
    }
}
