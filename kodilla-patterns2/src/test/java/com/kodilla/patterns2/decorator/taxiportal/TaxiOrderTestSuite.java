package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Test;                       // [2]

import java.math.BigDecimal;                             // [3]

import static org.junit.jupiter.api.Assertions.*;        // [4]

class TaxiOrderTestSuite {                               // [5]

    @Test                                                 // [6]
    public void testBasicTaxiOrderGetCost() {             // [7]
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();         // [8]
        // When
        BigDecimal calculatedCost = theOrder.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(5), calculatedCost);   // [10]
    }                                                     // [11]

    @Test                                                 // [12]
    public void testBasicTaxiOrderGetDescription() {      // [13]
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();         // [14]
        // When
        String description = theOrder.getDescription();    // [15]
        // Then
        assertEquals("Drive a course", description);       // [16]
    }
}