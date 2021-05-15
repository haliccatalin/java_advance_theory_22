package com.sda.labmda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ex2();

    }

    private static void theory() {
        // varianta fara lambda
        Person person = new Person(39, "Popescu", "Marian");
        InterfaceForLambda<Person> personPredicate = new AdultPersonTest();
        personPredicate.printMessage(person.getName());

        Person person2 = new Person(20, "Gigel", "Cantaretul");

        // lambda expression se foloseste atunci cand in cadrul intefetei avem
        // o singura metoda

        // with lambda expression version
//        Predicate<Person> personPredicate1 = p -> p.getAge() >= 18;

        // without lambda expression version
        Predicate<Person> personPredicate2 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        };


        // message -> este acelasi lucru cu parametrul metodei printMessage(String message) din interfata
        InterfaceForLambda<Person> personInterfaceForLambda = message -> message.toLowerCase().equals("popescu") ;
        System.out.println(personInterfaceForLambda.printMessage("popescu"));


        // () - semnifica ca metoda run in cazul asta, nu are parametrii
        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();

        // suprascrie metoda test() din interfata predicate, cu aceasta linie: s -> s.startsWith("ABC")
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));
    }

    private static void ex1() {
        NameFormatInterface nameFormatInterface = new NameFormatInterface() {
            @Override
            public String formatName(String firstName, String lastName) {
                return "First name: " + firstName + " -> Last name: " + lastName;
            }
        };

        // lambda expression sample
        NameFormatInterface nameFormatInterfaceLambda = (String firstName, String lastName) -> "First name: " + firstName + " -> Last name: " + lastName + " lambda!";
        // sau
        // NameFormatInterface nameFormatInterfaceLambda = (firstName, lastName) -> "First name: " + firstName + " -> Last name: " + lastName + " lambda!";

        // fara lambda expression
        String name = nameFormatInterface.formatName("Catalin", "Halic");
        System.out.println(name);

        // cu lamda
        String nameLambda = nameFormatInterfaceLambda.formatName("Catalin", "Halic");
        System.out.println(nameLambda);
    }

    private static void ex2() {
        List<String> carNameList = new ArrayList<>();

        carNameList.add("Fiat");
        carNameList.add("BMW");
        carNameList.add("Saab");
        carNameList.add("Audi");

        // fara lambda
        System.out.println("Without Lambda expression");
        for(String carName : carNameList) {
            System.out.println("CAR BRAND");
            System.out.println(carName);
        }

        // cu lambda
        System.out.println("With Lambda expression");
        carNameList.forEach((String carName) -> {
            System.out.println("Brand CAR LAMBDA");
            System.out.println(carName);
        });
    }
 }
