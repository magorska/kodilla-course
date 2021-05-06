package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for Square")
    class TestForSquare {
        @Test
        public void testAddFigure() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            // When
            enterShape.addFigure(new Square(5));
            // Then
            Assertions.assertEquals(1, enterShape.getSize());
        }

        @Test
        public void testRemoveFigure() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            enterShape.addFigure(new Square(5));
            // When
            boolean result = enterShape.removeFigure(new Square(5));
            // Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, enterShape.getSize());
        }
        @Test
        public void testRemoveFigureIfNull() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            // When
            boolean result = enterShape.removeFigure(new Square(5));
            // Then
            Assertions.assertFalse(result);
            Assertions.assertEquals(0, enterShape.getSize());
        }
        @Test
        public void testGetFigure() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            enterShape.addFigure(new Square(5));
            enterShape.addFigure(new Circle(7));
            // When
            Shape getShape = enterShape.getFigure(0);
            // Then
            Assertions.assertEquals(new Square(5), getShape);
        }
        @Test
        public void testGetFigureIfNot() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            enterShape.addFigure(new Square(5));
            enterShape.addFigure(new Circle(7));
            // When
            Shape getShape = enterShape.getFigure(-1);
            // Then
            Assertions.assertNull(getShape);
        }
        @Test
        public void testGetFigureIf() {
            // Given
            ShapeCollector enterShape = new ShapeCollector();
            enterShape.addFigure(new Square(5));
            enterShape.addFigure(new Circle(7));
            // When
            Shape getShape = enterShape.getFigure(10);
            // Then
            Assertions.assertNull(getShape);
        }

    }


}
