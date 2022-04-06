package com.haa.streams.streamofdata;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileAndFilter {

    public static void main(String[] args) {

        try (Stream<String> data = Files.lines(Paths.get("data.txt"));) {

            data
                    .sorted()
                    .filter(i -> i.length() > 13)
                    .forEach(System.out::println);

            /**
             * Output:
             * AdriannaEdwards
             * CarlosSullivan
             * FrederickPerry
             */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
