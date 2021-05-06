package com.kodilla.testing.shape;

public class Square implements Shape{
    double field;
    public Square(double side) {
        field = side*side;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return field;

    }
}
