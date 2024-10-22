package com.WeatherMonitoringSystem.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather_data")
public class WeatherData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String city;
	private double temperature;
	private double feelLike;
	private String weatherCondition;
	private LocalDate data;
	public WeatherData() {
		
		// TODO Auto-generated constructor stub
	}
	public WeatherData(Long id, String city, double temperature, double feelLike, String weatherCondition,
			LocalDate data) {
		
		this.id = id;
		this.city = city;
		this.temperature = temperature;
		this.feelLike = feelLike;
		this.weatherCondition = weatherCondition;
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getFeelLike() {
		return feelLike;
	}
	
	public String getWeatherCondition() {
		return weatherCondition;
	}
	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}
	public LocalDate getData() {
		return data;
	}

	public void setFeelsLike(double feelsLike) {
		// TODO Auto-generated method stub
		this.feelLike = feelLike;
	}
	public void setDate(LocalDate now) {
		// TODO Auto-generated method stub
		this.data = data;
	}
	
	
	

}
