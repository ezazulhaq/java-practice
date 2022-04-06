package com.haa.streams.streamofdata;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCSVFileAndConvertToMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        try (Stream<String> data = Files.lines(Paths.get("data2.csv"))) {

            map = data
                    .map(i -> i.split(","))
                    .filter(i -> i.length == 4 && Integer.parseInt(i[2]) > 25)
                    .collect(Collectors.toMap(i -> i[0], i -> Integer.parseInt(i[2])));

            map.forEach((i, j) -> System.out.println(i + " " + j));
            /**
             * Output:
             * Aiden 29
             * Kirsten 28
             * Rosie 27
             * Miley 29
             * Alen 26
             */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
