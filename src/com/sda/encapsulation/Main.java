package com.sda.encapsulation;

import com.sda.encapsulation.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Person p = new Person();
//        String cnp = "1234567890123";
//        p.setCnp(cnp);
//
//        Person p2 = new Person("Catalin", "0751111111", "1234567890123");
//        p2.setName("Popescu");
//        p2.setPhone("112");
//        p2.setCnp("1232131123131");
//
//        System.out.println("Getters");
//        System.out.println(p2.getName());
//        System.out.println(p2.getPhone());
//        System.out.println(p2.getCnp());
//
//        System.out.println(p2.toString());

//        Dog dog1 = new Dog("rex", 2, "M", "pitbul", 3.5);
//        System.out.println(dog1.toString());
//
//        Dog dog2 = new Dog("F", "pitbul");
//        System.out.println(dog2.toString());

        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        Pocket pocket = new Pocket();
        pocket.setMoney(90);

        double result = pocket.getMoney(money);
        System.out.println(result);


    }
}
