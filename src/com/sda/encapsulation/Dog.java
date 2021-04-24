package com.sda.encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
//        this.age = age;
        this.setAge(age);
        this.gender = gender;
        this.race = race;
//        this.weight = weight;
        this.setWeight(weight);
    }

    public Dog(String gender, String race) {
//        this(...) apeleaza constructorul clasei curente
        this("", 0, gender, race, 1);
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Varsta nu poate sa fie negativa!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(double weight) {
        if(weight <= 0) {
            System.out.println("Greutatea trebuie sa fie mai mare ca 0!");
        } else {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", gender: " + this.gender + ", race: " + this.race + ", weight: " + this.weight;
    }
}
