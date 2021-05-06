package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double field;

    public Triangle(double high, double base) {
        field = 0.5*base*high;
    }

    public String getShapeName() {
        return "Trinagle";
    }

    public double getField() {
        return field;
    }
}
