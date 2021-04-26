package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        // Test Calculator
        System.out.println("\n Test drugi:");
        Calculator calculator = new Calculator();

        double a = 7;
        double b = 2;

        double addAToB = calculator.getAddAToB();
        if (addAToB == 9) {
            System.out.println("Wynik prawidłowy!");
        } else {
            System.out.println("Wynik błędny!");
        }

        double subtractAToB = calculator.getSubtractAToB();
        if (subtractAToB == 5) {
            System.out.println("Wynik prawidłowy!");
        } else {
            System.out.println("Wynik błędny!");
        }


    }
}