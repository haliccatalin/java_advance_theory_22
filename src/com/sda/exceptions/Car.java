package com.sda.exceptions;

public class Car {
    private int speed = 0;

    public void increaseSpeed() throws CarCrashedException {
        speed += 70;
        if(speed > 200) {
            // in acest caz "this" trimite intregul obiect ca
            // parametru clasei "CarCrashedException"
            throw new CarCrashedException(this);
        }
    }

    public String getBrand() {
        return "Audi";
    }

    public int getSpeed() {
        return this.speed;
    }

}
