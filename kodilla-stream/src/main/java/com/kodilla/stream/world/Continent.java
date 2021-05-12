package com.kodilla.stream.world;

import java.util.List;
import java.util.ArrayList;

public final class Continent {

    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();
    private final String nameOfContinent;


    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public List<Country> getListOfCountriesOnContinent() {
        return new ArrayList<>(listOfCountriesOnContinent);
    }
    public void addCountry(Country country) {
        listOfCountriesOnContinent.add(country);
    }
}
