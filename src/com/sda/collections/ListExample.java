package com.sda.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Array
        int[] numbers = new int[]{1,2,3,4,5,6,7};

        numbers[numbers.length - 1] = 1;
        for (int i: numbers) {
            System.out.print(i);
        }
        System.out.println();

        // List
        List<Integer> numberList = new ArrayList<>();


        Student student = new Student();
        student.sayHello();

        // decalaram o variabila de tipul interfetei
        IPerson personInterface;

        // intializam interfata
        // cand initializam o interfata suntem OBLIGATI sa implementam metodele
        // din interfata.
        personInterface = new IPerson() {
            @Override
            public void sayHello() {
                System.out.println("hello from interface!");
            }
        };

        String name = "Catalin";

        student.sayHelloFromInterfaceParam(personInterface);





    }
}
