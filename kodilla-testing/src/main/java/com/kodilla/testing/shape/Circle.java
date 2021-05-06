package com.kodilla.testing.shape;

public class Circle implements Shape {
    double field;

    public Circle(double r) {
        field = Math.PI*r*r;
    }

    public String getShapeName() {
        return "Circle";

    }

    public double getField() {
        return field;

    }
}
