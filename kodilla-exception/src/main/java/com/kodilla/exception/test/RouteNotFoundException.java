package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    RouteNotFoundException(final String airport) {
        super("Route to " + airport + " cannot be found.");
    }
}