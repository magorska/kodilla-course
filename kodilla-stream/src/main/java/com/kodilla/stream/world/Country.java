package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantityOfCountry;
    private final String nameOfContinent;

    public Country(final String nameOfCountry,final BigDecimal peopleQuantityOfCountry, final String nameOfContinent) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
        this.nameOfContinent = nameOfContinent;
    }


    public BigDecimal getPeopleQuantity() {
        return peopleQuantityOfCountry;
    }
}
