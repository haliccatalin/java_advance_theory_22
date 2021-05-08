package com.sda.collections;

import java.util.*;

public class SetSample {
    public static void main(String[] args) {

        // Asemanator cu MAP, si aici toate elemente trebuie sa fie UNICE
        // altfel se suprascriu.
        Set<String> brandCars = new HashSet<>();
        // add => pentru adaugare
        brandCars.add("BMW");
        brandCars.add("Audi");
        brandCars.add("Volvo");

        // contains => verifica daca un element este in lista
        if(brandCars.contains("Audi")) {
            System.out.println("Is present in set!");
        } else {
            brandCars.add("Audi");
        }

        for (String temp : brandCars) {
            System.out.println(temp);
        }

//        pentru a lua un element din SET vom folosi Stream
//        Foo foo = set.stream().filter(item->item.equals(theItemYouAreLookingFor)).findFirst().get();
    }

    public static void ex() {
        Set<String> colors = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Insert color: ");
            String color = scanner.nextLine();

            if(color.equals("stop")) {
                break;
            }

            if(colors.contains(color)) {
                System.out.println("Doresti sa o stergi? (y/n)");
                String response = scanner.next();
                // se adauga un nou nextline() pentru a face clear la input
                // doar daca folosim scanner de 2 ori in acelasi loop
                scanner.nextLine();

                if(response.equals("y")) {
                    colors.remove(color);
                }
            } else {
                colors.add(color);
            }
        }

        System.out.println("Before sorting");
        for (String temp : colors) {
            System.out.println(temp);
        }

        System.out.println("-------------------");

        // Sorting HashSet using List
        // am transformat "SET-ul" intr-o lista
        List<String> list = new ArrayList<>(colors);

        // Folosind metoda sort din clasa Collections am sortat lista
        Collections.sort(list);

        for(String color: list) {
            System.out.println(color);
        }
    }
}
