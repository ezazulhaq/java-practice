package com.haa.streams.intexample;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntegerStreamWithSummary {

    public static void main(String[] args) {

        IntSummaryStatistics stats = IntStream.of(4, 6, 8, 2, 4, 7, 9)
                .summaryStatistics();

        System.out.println("Statistics = " + stats);
    }
}
