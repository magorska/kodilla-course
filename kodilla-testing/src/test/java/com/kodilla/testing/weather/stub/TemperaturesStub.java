package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        // dummy data
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);

        return stubResult;
    }

    @Override
    public List<Double> getValueOfTemperature() {
        return null;
    }
}