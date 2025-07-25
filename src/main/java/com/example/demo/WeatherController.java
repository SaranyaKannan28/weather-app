package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class WeatherController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherService weatherService;

    // Display the form on home page
    @GetMapping("/")
    public String displayForm() {
        return "weather"; // this maps to weather.html
    }

    // Handle form submission and return weather data or error
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, Model model) {
        try {
            WeatherResponse response = weatherService.getWeather(city);
            model.addAttribute("weather", response);
        } catch (WeatherServiceException e) {
            logger.error("Failed to fetch weather for city: {}", city, e);
            model.addAttribute("error", "Could not fetch weather for '" + city + "'. Please check the city name or try again later.");
        } catch (Exception e) {
            logger.error("Unexpected error occurred", e);
            model.addAttribute("error", "An unexpected error occurred. Please try again.");
        }
        return "weather"; // return the same form with data or error
    }
}
