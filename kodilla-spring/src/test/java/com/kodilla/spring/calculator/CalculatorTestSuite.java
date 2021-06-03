package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double addResult = calculator.add(5,5);
        double subResult = calculator.sub(6,1);
        double mulResult = calculator.mul(2,4);
        double divResult = calculator.div(10,2);
        //Then
        Assertions.assertEquals(10, addResult, 0.01);
        Assertions.assertEquals(5, subResult, 0.01);
        Assertions.assertEquals(8, mulResult, 0.01);
        Assertions.assertEquals(5, divResult, 0.01);
    }
}
