package com.sda.inheritance.shapes;

public class Circle extends Shape implements IShape, IArea {
    private double radius;

    public Circle(double radius) {
        super("circle");

        this.radius = radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            this.radius = 1.0;
        } else {
            this.radius = radius;
        }
//        Echivalentul codului de mai sus
//        if(radius <= 0) {
//            radius = 1.0;
//        }
//
//        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * this.radius * this.radius;

//        ridicarea la patrat
//        Math.pow(this.radius, 2);

        System.out.println(super.getType() + " Area: " + area);

    }

    @Override
    public void calculatePerimeter() {
        double result = 2 * Math.PI * this.radius;

        System.out.println("Perimetru Cerc: " + result);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
