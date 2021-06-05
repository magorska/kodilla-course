package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testCreateBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("thousand island dressing")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        // Then
        Assertions.assertEquals(4, howManyIngredients);

    }
}
