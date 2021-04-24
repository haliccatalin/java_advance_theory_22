package com.sda.inheritance.animals;

public class Cat extends Animal {

    public Cat(String name, int age, String gender, String race, double weight) {
        super(name, age, gender, race, weight);
    }

    @Override
    public void yieldVoice() {
        System.out.println("Miau Miau");
    }
}
