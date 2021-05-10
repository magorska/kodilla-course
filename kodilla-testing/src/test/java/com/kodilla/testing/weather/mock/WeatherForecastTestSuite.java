package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverage() {
        // Given
        Temperatures valueOfTemperaturesMock = mock(Temperatures.class);
        when(valueOfTemperaturesMock.getValueOfTemperature()).thenReturn(Arrays.asList(17.1, 34.7, 34.2, 16.2 ));
        WeatherForecast weatherForecast = new WeatherForecast(valueOfTemperaturesMock);
        // When
        Double ifAverageOfTemperature = weatherForecast.averageOfTemperature();
        // Then
        Assertions.assertEquals(25.55, ifAverageOfTemperature,0.01);
    }
    @Test
    void testMedianOfTemperaturesIfEven() {
        // Given
        Temperatures valueOfTemperaturesMock = mock(Temperatures.class);
        when(valueOfTemperaturesMock.getValueOfTemperature()).thenReturn(Arrays.asList(12.4, 14.1, 16.3, 13.6));
        WeatherForecast weatherForecast = new WeatherForecast(valueOfTemperaturesMock);
        // When
        Double ifMedianOfTemperaturesIsEven = weatherForecast.medianOfTemperatures();
        // Then
        Assertions.assertEquals(13.85, ifMedianOfTemperaturesIsEven, 0.01);
    }

}