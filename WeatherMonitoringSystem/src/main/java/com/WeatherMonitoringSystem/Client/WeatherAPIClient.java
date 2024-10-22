package com.WeatherMonitoringSystem.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.WeatherMonitoringSystem.Model.WeatherResponse;

@Component
public class WeatherAPIClient {
	
	 private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

	    private final String apiKey = "db7b68cd15c1f11ad7258e21bebba3f4";

	    public WeatherResponse getWeather(String city) {
	        RestTemplate restTemplate = new RestTemplate();
	        return restTemplate.getForObject(API_URL, WeatherResponse.class, city, apiKey);
	    }
}