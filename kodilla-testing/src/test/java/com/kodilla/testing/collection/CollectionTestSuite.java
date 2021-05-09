package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("test Odd Numbers Exterminator Empty List")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given - sytuacja, która zastajemy
        List<Integer> empty = new ArrayList<>();
        // When - sytuacja, ktora chcemy przetestowac. Nowa lista ktora odnosi sie do odpowiedniego obiektu i metody (oraz listy ktora testujemy/otrzymalismy)
        OddNumbersExterminator object = new OddNumbersExterminator();
        List<Integer> ifEmptyList = object.exterminate(empty);
        System.out.println("Testing" + ifEmptyList);
        // Then - sprawdzamy warunki zapewniajace, ze metoda dziala poprawnie
        Assertions.assertEquals(empty,ifEmptyList);
    }
    @DisplayName("test Odd Numbers Exterminator Normal List")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given - lista, ktora otrzymalismy oraz taka, jaka powinna byc (z parzystymi liczbami)
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(4);
        normalList.add(7);
        normalList.add(12);
        normalList.add(15);
        normalList.add(22);

        List<Integer> evenNum = new ArrayList<>();
        evenNum.add(4);
        evenNum.add(12);
        evenNum.add(22);


        // When - nowa lista,ktora odnosi sie do odpowiedniej klasy i metody (oraz listy ktora testujemy/otrzymalismy)
        OddNumbersExterminator object = new OddNumbersExterminator();
        List<Integer> ifEvenNum = object.exterminate(normalList);
        System.out.println("Testing" + normalList);
        // Then - sprawdzamy warunki ze metoda dziala poprawnie
        Assertions.assertEquals(evenNum,ifEvenNum);
    }




}
