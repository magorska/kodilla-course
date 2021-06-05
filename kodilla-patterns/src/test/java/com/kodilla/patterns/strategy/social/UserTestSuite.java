package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        // Given
        User jessica = new Millenials("Jessica");
        User michael = new YGeneration("Michael");
        User richard = new ZGeneration("Richard");

        // When
        String jessicaUses = jessica.sharePost();
        System.out.println("Jessica says: " + jessicaUses);
        String michaelUses = michael.sharePost();
        System.out.println("Michale says: " + michaelUses);
        String richardUses = richard.sharePost();
        System.out.println("Richard says: " + richardUses);

        // Then
        Assertions.assertEquals("Snapchat is favourite app of Millenials", jessicaUses);
        Assertions.assertEquals("Facebook is favourite app of YGeneration", michaelUses);
        Assertions.assertEquals("Twitter is favourite app of ZGeneration", richardUses);



    }

    @Test
    void testIndividualSharingStrategy() {

    }
}
