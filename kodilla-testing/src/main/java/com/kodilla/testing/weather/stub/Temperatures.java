package com.kodilla.testing.weather.stub;

import java.util.List;
import java.util.Map;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
    Map<String, Double> getTemperatures();

    List<Double> getValueOfTemperature();
}