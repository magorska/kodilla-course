package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
