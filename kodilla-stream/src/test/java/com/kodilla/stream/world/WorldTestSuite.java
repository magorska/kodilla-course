package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country poland = new Country("Poland", new BigDecimal(37987102),"Europe");
        Country japan = new Country("Japan", new BigDecimal(126098123), "Asia");
        Country egipt = new Country("Egipt", new BigDecimal(96091284), "Africa");
        Country germany = new Country("Germany", new BigDecimal(56102345), "Europe");
        Country korea = new Country("South Korea", new BigDecimal(50123098), "Asia");
        Country kenya = new Country("Kenya", new BigDecimal(49284019), "Africa");
        Country czech = new Country("Czech", new BigDecimal(12093874), "Europe");
        Country china = new Country("China", new BigDecimal(1389092389), "Asia");
        Country libia = new Country("Libia", new BigDecimal(6534901), "Africa");

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        africa.addCountry(kenya);
        africa.addCountry(egipt);
        africa.addCountry(libia);
        asia.addCountry(japan);
        asia.addCountry(korea);
        asia.addCountry(china);
        europe.addCountry(poland);
        europe.addCountry(czech);
        europe.addCountry(germany);

        // When
        BigDecimal totalPopulation = world.getPeopleQuantity();
        // Then
        BigDecimal expectedResult = new BigDecimal("1823407135");
        Assertions.assertEquals(expectedResult, totalPopulation);

    }
}
