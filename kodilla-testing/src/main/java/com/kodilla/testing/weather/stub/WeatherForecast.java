package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageOfTemperature() {
        List<Double> values = temperatures.getValueOfTemperature();
        double base = 0;
        for (Double listOfValue : values) {
            base += listOfValue;
        }
        return base / values.size();
    }
    public double medianOfTemperatures() {
        List<Double> values = temperatures.getValueOfTemperature();
        Collections.sort(values);
        if ( values.size() %2 == 0) {
            double midValue = values.get(values.size() / 2);
            double midValue2 = values.get(values.size() / 2 - 1);
            return (midValue + midValue2) / 2;
        } else {
            return values.get(values.size() / 2);
        }
    }



}