package com.kodilla.exception.test;

public class SearchFlight {

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw","Paris");
        FindFlight findFlight = new FindFlight();


        try {
            findFlight.findFlight(flight);
            System.out.println("Flight found");
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found");
        }
    }
}
