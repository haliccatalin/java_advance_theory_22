package com.sda.nestedclasses;

public class Main {
    public static void main(String[] args) {
        staticNestedClasses();
    }

    public static void nonStaticNestedClasses() {
        Bicycle bicycle = new Bicycle();
        System.out.println("Max Speed: " + bicycle.getMaxSpeed());
        // Wheel este definita in interiorul clasei Bicycle
        Bicycle.Wheel wheel = bicycle.new Wheel();

        // din clasa Wheel
        wheel.damage();

        // clasa Wheel este instantiata pe baza obiectului bicycle
        // asta inseana in acest caz ca are acces la proprietatile din
        // clasa Bicycle, astfel poate sa modifice acele proprietati
        System.out.println("New Max Speed: " + bicycle.getMaxSpeed());
    }

    public static void staticNestedClasses() {
        Car audi = new Car();
        System.out.println("Car max speed: " + audi.getMaxSpeed() + " km/h!");

        Car.Mechanic mechanic = new Car.Mechanic();
        mechanic.repair(audi);

        System.out.println("Car new max speed: " + audi.getMaxSpeed() + " km/h!");
    }
}
