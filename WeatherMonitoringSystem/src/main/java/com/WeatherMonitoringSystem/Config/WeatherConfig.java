package com.WeatherMonitoringSystem.Config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.WeatherMonitoringSystem.Client.WeatherAPIClient;

@Configuration
@ConfigurationProperties(prefix = "weather.threshold")
public class WeatherConfig {

	 @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	
}
