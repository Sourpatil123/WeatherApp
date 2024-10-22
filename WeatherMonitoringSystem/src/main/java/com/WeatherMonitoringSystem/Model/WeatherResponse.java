package com.WeatherMonitoringSystem.Model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

	 private Temperature main;
	    private List<Weather> weather;

	    public Temperature getMain() {
	        return main;
	    }

	    public void setMain(Temperature main) {
	        this.main = main;
	    }

	    public List<Weather> getWeather() {
	        return weather;
	    }

	    public void setWeather(List<Weather> weather) {
	        this.weather = weather;
	    }
	
    }






	  

