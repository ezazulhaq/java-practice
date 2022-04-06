package com.haa.streams.streamofdata;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamCSVFileAndFilterWithAge {

    public static void main(String[] args) {

        try (Stream<String> data = Files.lines(Paths.get("data2.csv"))) {

            data
                    .map(i -> i.split(","))
                    .filter(i -> i.length == 4 && Integer.parseInt(i[2]) > 25)
                    .forEach(i -> System.out.println(i[0] + " " + i[1] + " " + i[3]));

            /**
             * Output:
             * Alen Bennett 6
             * Miley Ryan 4
             * Aiden Dixon 8
             * Rosie Stevens 1
             * Kirsten Murphy 13
             */
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
