package com.sda.inheritance.animals;

public class Dog extends Animal {

    public Dog(String name, int age, String gender, String race, double weight) {
        super(name, age, gender, race, weight);
    }

    @Override
    public void yieldVoice() {
        System.out.println("Ham Ham");
    }
}
