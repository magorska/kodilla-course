package com.kodilla.good.patterns.flightSearcher;

import java.util.HashSet;
import java.util.Set;

public class AvailableFlights {

    private Set<Flights> availableFlights = new HashSet<>();

    public AvailableFlights(Set<Flights> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flights> getAvailableFlights() {

        availableFlights.add(new Flights("WAW", "GDA"));
        availableFlights.add(new Flights("GDA", "WRO"));
        availableFlights.add(new Flights("GDA", "KAT"));
        availableFlights.add(new Flights("WAW", "KRK"));
        availableFlights.add(new Flights("WRO", "KRK"));

        return availableFlights;
    }
}
