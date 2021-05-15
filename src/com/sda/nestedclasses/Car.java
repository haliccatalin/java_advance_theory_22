package com.sda.nestedclasses;

public class Car {
    private int maxSpeed = 250;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Mechanic {


        public void repair(Car car) {
        // nested static class can refer
        // private field of outer class
            car.maxSpeed += 15;
        }
    }

}
