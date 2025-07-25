package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private static final String API_URL =
            "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

    public WeatherResponse getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            return restTemplate.getForObject(API_URL, WeatherResponse.class, city, apiKey);
        } catch (RestClientException e) {
            // You can log the actual error here if needed
            throw new WeatherServiceException("Unable to fetch weather data for: " + city);
        }
    }
}
