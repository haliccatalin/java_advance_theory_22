package com.sda.streams;

import com.sda.encapsulation.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();

        People p1 = new People(18, "Thomas");
        People p2 = new People(30, "Andrew");
        People p3 = new People(28, "thomas");
        People p4 = new People(9, "Andrew");
        People p5 = new People(26, "thomas");


        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);

//        int age = 0, counter = 0;
//        for(People people : peopleList) {
//            if(people.getName().equalsIgnoreCase("thomas")) {
//                System.out.println(people.getAge() + " " + people.getName());
//
//                age += people.getAge();
//                counter += 1;
//            }
//        }
//
//        System.out.println("AGE: " + (age / counter));

        // folosim filter pentru a cauta mai rapid in interiorul unei liste
        List<People> peopleWithNameThomas = peopleList
                .stream()
                // parcurgem fiecare element din lista si verificam daca se indeplineste conditia pusa
                .filter((People p) -> p.getName().equalsIgnoreCase("thomas") && (p.getAge() > 26 && p.getAge() < 29))
                // rezultatele obtinute se salveaza intr-o lista
                .collect(Collectors.toList());

//        for (People p : peopleWithNameThomas) {
//            System.out.println(p.getName() + " " + p.getAge());
//        }

        OptionalDouble averageSample = peopleList
                .stream()
                .filter((People p) -> p.getName().equalsIgnoreCase("thomas")) // retuneaza obiectele cu numele thomas
                .mapToDouble(People::getAge) // returneaza un array cu varsta celor cu numele thomas
                .average(); // calculeaza media aritmetica

        System.out.println(averageSample);


        // allMatch
        boolean areAllAdults = peopleList.stream().allMatch((People p) -> p.getAge() >= 18);
        System.out.println("Are all adults? : " + areAllAdults);

        // anyMatch
        boolean areUnder18 = peopleList.stream().anyMatch((People p) -> p.getAge() < 18 && p.getName().equalsIgnoreCase("Andrew"));
        System.out.println("Are people under 18 with name Andrew? " + areUnder18);


        List<String> reduceSample = Arrays.asList("Andrei", "Mihai", "Mircea", "Elena", "Ion", "Vlad");

        String nameListAsString = reduceSample.stream().reduce("", (result, name) -> {
            if(result.equals("")) {
                return result + name;
            } else {
                return result + ", " + name;
            }
        });
        System.out.println(nameListAsString);


        // calculate total age from people list
        int totalAge = peopleList
                .stream()
                .map(people -> people.getAge())
                .reduce(0, (result, age) -> result + age);

        System.out.println(totalAge);



        System.out.println("Suntem experti in java? " + (1 > 0 ? "Normal!" : "Evident!"));

        // sorted
        System.out.println();
        System.out.println("Sort list with Stream");
        List<String> sampleForSort = Arrays.asList("Ana", "Mihai", "Mircea", "Elena", "Ion", "Vlad", "Andrei");
        sampleForSort.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));


    }
}
