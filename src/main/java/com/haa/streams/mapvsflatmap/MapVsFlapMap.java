package com.haa.streams.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlapMap {

    public static void main(String[] args) {

        List<Customer> list = getAll();

        // Get email of all customers as List of String
        // customer -> customer.getEmail() -- one to one mapping
        List<String> emailList = list
                .stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());
        System.out.println(emailList); // [ezaz@gmail.com, haq@gmail.com, abdul@gmail.com, heena@gmail.com]

        // Get phone Num of all customers as List of List String
        // customer -> customer.getMobile() -- one to many mapping
        List<List<Integer>> phoneNumbers = list
                .stream()
                .map(Customer::getMobile)
                .collect(Collectors.toList());
        System.out.println(phoneNumbers); // [[234234234, 4234234], [345345345, 345345435], [353454353, 56765654],
                                          // [4564456, 675673453]]

        // Get phone Num of all customers as List of String
        // customer -> customer.getMobile().stream() -- one to many mapping
        List<Integer> phoneNumbersAll = list
                .stream()
                .flatMap(customer -> customer.getMobile().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersAll); // [234234234, 4234234, 345345345, 345345435, 353454353, 56765654, 4564456,
                                             // 675673453]
    }

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "Ezaz", "ezaz@gmail.com", Arrays.asList(234234234, 4234234)),
                new Customer(102, "Haq", "haq@gmail.com", Arrays.asList(345345345, 345345435)),
                new Customer(103, "Abdul", "abdul@gmail.com", Arrays.asList(353454353, 56765654)),
                new Customer(104, "Heena", "heena@gmail.com", Arrays.asList(4564456, 675673453)))
                .collect(Collectors.toList());
    }
}
