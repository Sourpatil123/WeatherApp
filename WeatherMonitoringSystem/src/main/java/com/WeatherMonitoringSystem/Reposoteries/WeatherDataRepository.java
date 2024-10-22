package com.WeatherMonitoringSystem.Reposoteries;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WeatherMonitoringSystem.Entity.WeatherData;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long>{
	
	List<WeatherData> findByCity(String city);

	 List<WeatherData> findByCityAndDate(String city, LocalDate date);
	 
	 List<WeatherData> findAllByODateDesc();
}
