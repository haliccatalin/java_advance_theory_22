package com.sda.generictypes;

import com.sda.abstractization.Paznic;
import com.sda.encapsulation.Dog;
import com.sda.encapsulation.Person;
import com.sda.exceptions.Car;
import com.sda.exceptions.CarCrashedException;

public class Main {
    public static void main(String[] args) {
        // Clasa Car
        Car audi = new Car();
        GenericBox<Car> carGenericBox = new GenericBox<>(audi);

        Car car = carGenericBox.getItem();
        System.out.println("Car Brand: " + car.getBrand());

        System.out.println("------------------------");

        // Clasa Person
        Person person = new Person("Popescu", "075112312", "1321321231322");
        GenericBox<Person> personGenericBox = new GenericBox<>(person);
        Person popescu = personGenericBox.getItem();
        System.out.println("Name: " + popescu.getName());
        System.out.println("Phone: " + popescu.getPhone());
        System.out.println("CNP: " + popescu.getCnp());

        System.out.println("------------------------");

        // Clasa Dog
        Dog rex = new Dog("M", "labrador");
        GenericBox<Dog> dogGenericBox = new GenericBox<>(rex);
        Dog dog = dogGenericBox.getItem();

        System.out.println("Weight: " + dog.getWeight());

        System.out.println("------------------------");

        Paznic paznic = new Paznic(1, 2000, "Gigi", "21312312123", false);

        // Angajat, Paznic, Contabil, Inginer
        GenericTypeInheritance<Paznic> paznicGenericTypeInheritance = new GenericTypeInheritance<Paznic>(paznic);
        System.out.println("Nume: " + paznicGenericTypeInheritance.getName());

//        Varianta 1
        Paznic p1 = paznicGenericTypeInheritance.getItem();
        System.out.println("ID: " + p1.getId());

//        Varianta 2
        System.out.println("ID: " + paznicGenericTypeInheritance.getItem().getId());

        System.out.println("------------------------");

        // Generic Interface
        Incaltaminte incaltaminte1 = new Incaltaminte(30);
        Incaltaminte incaltaminte2 = new Incaltaminte(40);

        int result1 = incaltaminte1.compareTo(incaltaminte2);
        // 40 - 30 = 10;
        System.out.println("Rezultat Compare: " + result1);

        // prima comparare
        if(result1 > 0) {
            System.out.println("Incaltaminte 1 este mai mare");
        } else if (result1 < 0) {
            System.out.println("Incaltaminte 2 este mai mare");
        } else {
            System.out.println("Incaltaminte 1 si 2 sunt egale");
        }

        int result2 = incaltaminte2.compareTo(incaltaminte1);
        // 30 - 40 = -10;
        System.out.println("Rezultat Compare 2: " + result2);

        // a doua comparare
        if(result2 > 0) {
            System.out.println("Incaltaminte 2 este mai mare");
        } else if (result2 < 0) {
            System.out.println("Incaltaminte 1 este mai mare");
        } else {
            System.out.println("Incaltaminte 1 si 2 sunt egale");
        }

        System.out.println("------------------------");


        PersonGenericInterface person1 = new PersonGenericInterface("Gigi", 192);
        PersonGenericInterface person2 = new PersonGenericInterface("Ionel", 190);

        int result = person1.compareTo(person2);
        switch (result) {
            case 1:
                System.out.println(person1.getName() + " este mai inalt ca " + person2.getName());
                break;
            case 0:
                System.out.println(person1.getName() + " si " + person2.getName() + " au aceasi inaltime.");
                break;
            case -1:
                System.out.println(person1.getName() + " este mai scund ca " + person2.getName());
                break;
        }

        System.out.println("------------------------");
        GenericCup<String> stringGenericCup = new GenericCup<>("Cafea");
        GenericCup<Integer> intGenericCup = new GenericCup<Integer>(20);
        GenericCup<Double> doubleGenericCup = new GenericCup<>(21.8);

        GenericCup[] cupArrays = new GenericCup[]{stringGenericCup, intGenericCup, doubleGenericCup};
        for (GenericCup cup: cupArrays) {
            System.out.println(cup.getItem());
        }
    }
}
