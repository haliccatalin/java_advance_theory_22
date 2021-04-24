package com.sda.inheritance.shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("rectangle");

        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        if(this.length <= 0 || this.width <= 0) {
            System.out.println("Date invalide!");
        } else {
            double area = this.length * this.width;

            System.out.println(super.getType() + " Area: " + area);
        }
    }

    @Override
    public void calculatePerimeter() {
        double result = (2 * this.length) + (2 * this.width);

        System.out.println("Permetru Dreptunghi: " + result);
    }
}
