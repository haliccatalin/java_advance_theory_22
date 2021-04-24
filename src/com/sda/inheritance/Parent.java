package com.sda.inheritance;

public class Parent {
    private String name;
    private String phone;

    public Parent(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void printFields() {
        System.out.println("Parent class");
        System.out.println(this.name);
        System.out.println(this.phone);
    }

    public void parentMethod() {
        System.out.println("method from parent class");
    }


}
