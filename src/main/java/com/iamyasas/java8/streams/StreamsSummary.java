package com.iamyasas.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSummary {
    public static void main(String[] args) {

        /**
         * Declaration
         */
        String[] array = new String[]{"Yasas", "Ravin", "Ruwani", "Pransangika", "Yasas"};
        Stream<String> stream = Arrays.stream(array);

        List<String> list = Arrays.asList(array);
        stream = list.stream();
        stream = list.parallelStream();

        /**
         * **** Usage ****
         *
         * Functions summary
         *
         * 1) filter - create filtered stream - lambda function should return a boolean.
         * 2) map - apply function to every element and create a new stream - lambda function should return something.
         * 3) flatMap - create a stream combining multiple streams.
         * 4) forEach - apply function to every element - lambda function return will be ignored.
         * 5) match (anyMatch, allMatch, noneMatch)
         * 6) reduce
         * 7) collect - stream to collection.
         */


        /**
         * Intermediate VS terminal
         */
        System.out.println(stream.distinct().count());


        /**
         * filter, map and forEach
         */
        System.out.print("\n");
        list.stream().filter(name -> name.contains("R")).map(String::toUpperCase).forEach(System.out::println);


        /**
         * flatMap usage
         */
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Yasas", 30, new ArrayList<>(List.of("a", "b", "c")));
        employees.add(employee);

        employee = new Employee("Ravin", 29, new ArrayList<>(List.of("e", "f", "g")));
        employees.add(employee);

        System.out.print("\n");
        employees.stream().flatMap(emp -> emp.getSkills().stream()).forEach(System.out::print);


        /**
         * match
         */
        System.out.println("\n");
        System.out.println(list.stream().anyMatch(name -> name.contains("a")));
        System.out.println(list.stream().noneMatch(name -> name.contains("a"))); // equals !anyMatch
        System.out.print(list.stream().allMatch(name -> name.contains("a")));

        /**
         * reduce usage
         */
        System.out.println("\n");
        List<Integer> numberList = List.of(2, 5, 7);
        System.out.println(numberList.stream().reduce(6, (a, b) -> a + b));


        /**
         * collect usage
         */
        System.out.print("\n");
        List<String> lower = List.of("a", "b", "c", "d", "e");
        List<String> upperList = lower.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperList.forEach(System.out::print);


        /**
         * map vs forEach
         * map - intermediate operation - should return something(can't be void).
         * forEach - terminal operation - no point of return.
         */
        System.out.println("\n");
        list.stream().map(String::length).forEach(System.out::print);

    }
}

