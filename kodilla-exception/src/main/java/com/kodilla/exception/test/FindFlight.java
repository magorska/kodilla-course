package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    private Map<String, Boolean> flightBoard;

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
//        if (flightBoard.containsKey(flight.getArrivalAirport())) {// sprawdzamy czy miasto istnieje
//            if (flightBoard.get(flight.getArrivalAirport())) {
//                return true;
//            } else {
//                throw new RouteNotFoundException(flight.getArrivalAirport());
//            }
//        } else {
//            throw new RouteNotFoundException(flight.getArrivalAirport());
//        }
        if (flightBoard.containsKey(flight.getArrivalAirport()) && flightBoard.get(flight.getArrivalAirport())) {// sprawdzamy czy miasto istnieje
            return true;
        } else {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        }

    }

    public FindFlight() {
        this.flightBoard = new HashMap<>();
        flightBoard.put("Warsaw", true);
        flightBoard.put("Tokio", true);
        flightBoard.put("Paris", false);
    }
}
