package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testGetAverage {

    @Test
    void testGetAverage() {
        // Given
        int numbers [] = {1,4,5,2,2,6,1,3,5,5};
        double expectedAverage = 3.4;
        // When
        double resultAverage = ArrayOperations.getAverage(numbers);
        // Then
        Assertions.assertEquals(expectedAverage, resultAverage);
    }
}
