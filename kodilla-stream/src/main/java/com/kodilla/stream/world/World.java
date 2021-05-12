package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {

    private List<Continent> listOfContinents = new ArrayList<>();
//    private Continent continent;

    public List<Continent> getListOfContinents() {
        return new ArrayList<>(listOfContinents);
    }
    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPopulation = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, country) -> sum = sum.add(country));
        return totalPopulation;
    }


}
