package com.haa.streams.streamofdata;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamCSVFileAndFilter {

    public static void main(String[] args) {

        try (Stream<String> data = Files.lines(Paths.get("data2.csv"))) {

            int validateRow = (int) data
                    .map(i -> i.split(","))
                    .filter(i -> i.length == 4)
                    .count();

            System.out.println("Valid Rows = " + validateRow); // Valid Rows = 13

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
