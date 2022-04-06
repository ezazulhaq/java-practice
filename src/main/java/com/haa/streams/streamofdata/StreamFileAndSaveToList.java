package com.haa.streams.streamofdata;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileAndSaveToList {

    public static void main(String[] args) {

        try (Stream<String> data = Files.lines(Paths.get("data.txt"))) {
            List<String> list = data
                    .filter(i -> i.contains("lia"))
                    .collect(Collectors.toList());

            list.forEach(System.out::println); // WilliamMartin

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
