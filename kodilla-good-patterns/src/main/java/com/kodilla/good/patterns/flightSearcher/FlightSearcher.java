package com.kodilla.good.patterns.flightSearcher;

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

//    public Set<Flights> connectingAvailableFlights(String departureAirport, String arrivalAirport) {
//
//        Set<Flights> connectedFlights = availableFlights.stream()
//                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
//                .filter(flights -> flights.getArrivalAirport().equals(connectingAirport))
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        return availableFlights;
//    }
}
