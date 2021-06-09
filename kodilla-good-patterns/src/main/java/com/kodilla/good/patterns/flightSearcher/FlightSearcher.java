package com.kodilla.good.patterns.flightSearcher;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    private Set<Flights> availableFlights;

    public FlightSearcher(Set<Flights> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flights> availableFlightsFrom(String departureAirport) {
        availableFlights.stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        return availableFlights;
    }

    public Set<Flights> availableFlightsTo(String arrivalAirport) {
        availableFlights.stream()
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        return availableFlights;
    }

    public Set<Flights> connectedFlights(String departureAirport, String arrivalAirport) {
        Set<Flights> startAirport = availableFlights.stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
        Set<Flights> endAirport = availableFlights.stream()
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        Set<Flights> connectedFlightsList = new HashSet<>();

        for (Flights airport : startAirport) {
            for (Flights middleAirport : endAirport) {
                if (middleAirport.getDepartureAirport().equals(airport.getArrivalAirport())
                        && !airport.getDepartureAirport().equals(middleAirport.getArrivalAirport())) {
                    connectedFlightsList.add(airport);
                    connectedFlightsList.add(middleAirport);
                }
            }
        }
        return connectedFlightsList;
    }
}