package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        Double y = 1.5;
        // When&Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3.0, y));
    }
    @Test
    void probablyIWillThrowExceptionHughEdgeTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        Double y = 1.6;
        // When&Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.7, y));
    }
    @Test
    void probablyIWillThrowExceptionLowEdgeTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        Double y = 1.4;
        // When&Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, y));
    }
}
