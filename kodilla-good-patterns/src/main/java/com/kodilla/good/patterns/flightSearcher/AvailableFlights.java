package com.kodilla.good.patterns.flightSearcher;

import java.util.HashSet;
import java.util.Set;

public class AvailableFlights {

    private Set<Flights> availableFlights = new HashSet<>();

    public AvailableFlights(Set<Flights> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flights> getAvailableFlights() {
        return availableFlights;
    }
}
