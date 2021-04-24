package com.sda.inheritance.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.calculateArea();

        Rectangle r = new Rectangle(10, 2);
        r.calculateArea();

        System.out.println("-----------------------------");

        Shape s1 = new Circle(20);
        Shape s2 = new Rectangle(20, 30);


        System.out.println(s1.getClass());
//        System.out.println(s1.getType());
        s1.calculateArea();

//        System.out.println(s2.getType());
        s2.calculateArea();

        s1.calculatePerimeter();
        s2.calculatePerimeter();

        Circle circle = new Circle(340);
        // call method from interface with default keyword;
        circle.printMessage();

    }
}
