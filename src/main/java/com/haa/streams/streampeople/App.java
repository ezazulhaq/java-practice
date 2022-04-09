package com.haa.streams.streampeople;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<People> peopleList = getAllPeople();

        System.out.println("##############Declarative Approach################");
        List<People> femaleList = new ArrayList<>();
        for (People people : peopleList) {
            if (people.getGender().equals(Gender.FEMALE)) {
                femaleList.add(people);
            }
        }
        femaleList.forEach(System.out::println);

        System.out.println("##############Imperative Approach################");
        System.out.println("##############Filter################");
        List<People> femaleList1 = peopleList.stream()
                .filter(people -> people.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        femaleList1.forEach(System.out::println);

        System.out.println("##############Sorted################");
        List<People> sortedList = peopleList.stream()
                .sorted(Comparator.comparing(People::getAge))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("##############Sorted - Reversed################");
        List<People> sortedList1 = peopleList.stream()
                .sorted(Comparator.comparing(People::getAge).reversed())
                .collect(Collectors.toList());
        sortedList1.forEach(System.out::println);

        System.out.println("##############Sorted - multi staged################");
        List<People> sortedList2 = peopleList.stream()
                .sorted(Comparator.comparing(People::getAge).thenComparing(People::getGender))
                .collect(Collectors.toList());
        sortedList2.forEach(System.out::println);

        System.out.println("##############All Match################");
        boolean allMatchFlag = peopleList.stream()
                .allMatch(people -> people.getAge() > 20);
        System.out.println(allMatchFlag);

        System.out.println("##############Any Match################");
        boolean anyMatchFlag = peopleList.stream()
                .anyMatch(people -> people.getAge() > 20);
        System.out.println(anyMatchFlag);

        System.out.println("##############None Match################");
        boolean noneMatchFlag = peopleList.stream()
                .noneMatch(people -> people.getName().equals("Ali"));
        System.out.println(noneMatchFlag);

        System.out.println("##############Max################");
        Optional<People> maxAgePeople = peopleList.stream()
                .max(Comparator.comparing(People::getAge));
        System.out.println(maxAgePeople);

        System.out.println("##############Max - alternate approach################");
        peopleList.stream()
                .max(Comparator.comparing(People::getAge))
                .ifPresent(System.out::println);

        System.out.println("##############Min################");
        peopleList.stream()
                .min(Comparator.comparing(People::getAge))
                .ifPresent(System.out::println);

        System.out.println("##############Group################");
        Map<Gender, List<People>> groupByGender = peopleList.stream()
                .collect(Collectors.groupingBy(People::getGender));

        groupByGender.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
        });

        System.out.println("##############Group By Id################");
        Map<Integer, List<People>> groupByIdPeople = peopleList.stream()
                .collect(Collectors.groupingBy(People::getId));

        groupByIdPeople.forEach((id, people) -> {
            System.out.println(id);
            System.out.println(people.get(0).getName());
        });

        System.out.println("##############Group By Id and People################");
        Map<Integer, People> mapByIdPeople = peopleList.stream()
                .collect(Collectors.toMap(People::getId, Function.identity()));

        mapByIdPeople.forEach((id, people) -> System.out.println(id + ", " + people));

        System.out.println("##############Group By Id and Name################");
        Map<Integer, String> mapByIdName = peopleList.stream()
                .collect(Collectors.toMap(People::getId, People::getName));

        mapByIdName.forEach((id, name) -> System.out.println(id + ", " + name));

    }

    private static List<People> getAllPeople() {
        List<People> list = new ArrayList<>();
        list.add(new People(101, "Haq", 12, Gender.MALE));
        list.add(new People(102, "Abdul", 23, Gender.MALE));
        list.add(new People(103, "Shaik", 31, Gender.FEMALE));
        list.add(new People(104, "Ezaz", 17, Gender.MALE));
        list.add(new People(105, "Heena", 28, Gender.FEMALE));

        return list;
    }
}
