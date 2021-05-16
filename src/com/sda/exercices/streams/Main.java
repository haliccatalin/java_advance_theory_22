package com.sda.exercices.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Using streams, for a given lists:
 * - [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
 * - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) Sort the list.
 * b) Print only those names, that start with „E” letter.
 * c) Print values greater than 30 and lower than 200.
 * d) Print names uppercase.
 * e) Remove first and last letter, sort and print names.
 * f) *Sort backwards by implementing reverse Comparator and using lambda
 * expression.
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");

        System.out.println("Sort the list.");
        names
                .stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));

        System.out.println();
        System.out.println("Filter by E");
        names
                .stream()
                .filter((name) -> name.startsWith("E"))
                .forEach((name) -> System.out.println(name));

        System.out.println();
        System.out.println("Sort numbers");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
        numbers
                .stream()
                .filter((number) -> number > 30 && number < 200)
                .forEach((number) -> System.out.println(number));

        System.out.println();
        System.out.println("To Upper Case");
        names.stream().forEach((name) -> System.out.println(name.toUpperCase()));

        System.out.println();
        names.stream().map((String::toUpperCase)).forEach((name) -> System.out.println(name));

        System.out.println();
        System.out.println("Remove first and last letter, sort and print names.");
//        012
//        ana
        names
                .stream()
                .map((name) -> name.substring(1, name.length() - 1))
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));

        System.out.println("*Sort backwards by implementing reverse Comparator and using lambda\n" +
                " * expression.");
        names
                .stream()
                .map((name) -> new StringBuilder(name).reverse().toString())
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));
    }




}
