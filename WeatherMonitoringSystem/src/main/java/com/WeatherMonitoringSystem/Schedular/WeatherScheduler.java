package com.WeatherMonitoringSystem.Schedular;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.WeatherMonitoringSystem.Client.WeatherAPIClient;
import com.WeatherMonitoringSystem.Config.WeatherConfig;
import com.WeatherMonitoringSystem.Entity.WeatherData;
import com.WeatherMonitoringSystem.Model.WeatherResponse;
import com.WeatherMonitoringSystem.Model.WeatherSummary;
import com.WeatherMonitoringSystem.Service.EmailService;
import com.WeatherMonitoringSystem.Service.WeatherService;

@Component
public class WeatherScheduler {

	 @Autowired
	    private WeatherService weatherService;

	    
	 

	    /**
	     * This method is scheduled to run every hour to fetch weather data for a predefined city.
	     * The cron expression "0 0 * * * *" means:
	     * - 0 second
	     * - 0 minute
	     * - Every hour
	     * - Every day of the month
	     * - Every month
	     * - Every day of the week
	     * 
	     * Example: Fetches weather data for the city of "London" every hour.
	     */
	    @Scheduled(cron = "0 0 * * * *")
	    public void fetchWeatherDataPeriodically() {
	        String city = "London"; // You can change this city or make it configurable
	        System.out.println("Scheduled task: Fetching weather data for " + city);

	        try {
	            boolean isSuccess = weatherService.fetchAndSaveWeatherData(city);
	            if (isSuccess) {
	                System.out.println("Weather data for " + city + " successfully fetched and saved.");
	            } else {
	                System.out.println("Failed to fetch weather data for " + city);
	            }
	        } catch (Exception e) {
	            System.err.println("Error during scheduled weather data fetch: " + e.getMessage());
	        }
	    }

	    /**
	     * This method can be used to schedule another task for testing.
	     * Here, it runs every 5 minutes for demonstration purposes.
	     * The cron expression "0 0/5 * * * *" means:
	     * - 0 second
	     * - Every 5 minutes
	     * - Every hour, day, month, etc.
	     */
	    @Scheduled(cron = "0 0/5 * * * *")
	    public void fetchWeatherDataEveryFiveMinutes() {
	        String city = "New York"; // This task fetches weather data for "New York" every 5 minutes
	        System.out.println("Scheduled task: Fetching weather data for " + city);

	        try {
	            boolean isSuccess = weatherService.fetchAndSaveWeatherData(city);
	            if (isSuccess) {
	                System.out.println("Weather data for " + city + " successfully fetched and saved.");
	            } else {
	                System.out.println("Failed to fetch weather data for " + city);
	            }
	        } catch (Exception e) {
	            System.err.println("Error during scheduled weather data fetch: " + e.getMessage());
	        }
	    }

}
