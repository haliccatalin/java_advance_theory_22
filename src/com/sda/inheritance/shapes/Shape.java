package com.sda.inheritance.shapes;

public abstract class Shape {
    private String type; // circle, rectangle, etc.

    public Shape(String type) {
        this.type = type;
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Type: " + this.type;
    }
}
