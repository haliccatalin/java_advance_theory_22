package com.sda.exercices.enums;

public class Main {
    public static void main(String[] args) {
        Planets jupiter = Planets.JUPITER;
        System.out.println(jupiter.toString());
        System.out.println(jupiter.distanceFromEarth());

        System.out.println(jupiter.getDistance(Planets.JUPITER));

        Planets saturn = Planets.SATURN;
        System.out.println(saturn.toString());
        System.out.println(saturn.distanceFromEarth());
        System.out.println(saturn.getDistance(Planets.SATURN));

        Planets pluto = Planets.PLUTO;
        System.out.println(pluto.toString());
        System.out.println(pluto.distanceFromEarth());
        System.out.println(pluto.getDistance(Planets.PLUTO));
    }

}
