package com.WeatherMonitoringSystem.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.WeatherMonitoringSystem.Entity.WeatherData;
import com.WeatherMonitoringSystem.Service.WeatherService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/weather")
public class WeatherController {


    @Autowired
    private WeatherService weatherService;

    @Autowired
    private JavaMailSender emailSender;

    // Method to check the weather
    @PostMapping("/check") // Highlight: handles POST requests
    public Map<String, Object> checkWeather(@RequestParam String city) {
        String weather = weatherService.getWeather(city); // Assuming getWeather fetches the weather data
        Map<String, Object> response = new HashMap<>();
        response.put("city", city);
        response.put("weather", weather);
        return response; // Returning the weather data as a JSON response
    }

    // Method to send weather notification via email
    @PostMapping("/notify") // Highlight: handles POST requests for notifications
    public String sendWeatherNotification(@RequestParam String email, @RequestParam String city) {
        String weather = weatherService.getWeather(city);
        sendEmail(email, city, weather);
        return "Weather notification sent to " + email; // Return confirmation message
    }

    // Private method to send email
    private void sendEmail(String to, String city, String weather) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Weather Update for " + city);
        message.setText("The current weather in " + city + " is: " + weather);
        emailSender.send(message); // Sending email
    }
}
